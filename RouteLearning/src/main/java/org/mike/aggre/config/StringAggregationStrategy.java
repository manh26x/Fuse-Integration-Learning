package org.mike.aggre.config;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class StringAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		 if (oldExchange == null) {
	            return newExchange;
	        }

	        String oldBody = oldExchange.getIn().getBody(String.class);
	        String newBody = newExchange.getIn().getBody(String.class);
	        oldExchange.getIn().setBody(oldBody + "+" + newBody);
	        return oldExchange;
	}

}

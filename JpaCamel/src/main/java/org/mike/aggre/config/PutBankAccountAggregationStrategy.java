package org.mike.aggre.config;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class PutBankAccountAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		if(oldExchange == null) {
			System.out.println("lan 1");
			return newExchange;
		} else if((boolean) newExchange.getIn().getHeader("canUpdate")) {
			oldExchange.getIn().setHeader("canUpdate", true);
			System.out.println("lan 2");
			return oldExchange;
		} else {
			return newExchange;
		}
		
	}

}

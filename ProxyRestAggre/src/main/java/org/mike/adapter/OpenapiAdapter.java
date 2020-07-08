package org.mike.adapter;



import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;


public class OpenapiAdapter implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		if(oldExchange == null) {
			return newExchange;
		} else if(oldExchange.getIn().getHeader("goFirst").toString().equals("aggre")) {
				String body = newExchange.getIn().getBody().toString();
				int beginIndex = body.indexOf('=')+1;
				int endIndex = body.indexOf(", ");
				String token = body.subSequence(beginIndex, endIndex).toString();
				oldExchange.getIn().removeHeaders("*");
				oldExchange.getIn().setHeader("Authorization", "Bearer " + token);
				oldExchange.getIn().setHeader(Exchange.HTTP_METHOD, "POST");
				oldExchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
				oldExchange.getIn().removeHeader(Exchange.HTTP_URI);
				oldExchange.getIn().setHeader("Accept", "*/*");
				oldExchange.getIn().setHeader("ResponseStatus", true);
			return oldExchange;
		} else {
			String body = oldExchange.getIn().getBody().toString();
			int beginIndex = body.indexOf('=')+1;
			int endIndex = body.indexOf(", ");
			String token = body.subSequence(beginIndex, endIndex).toString();
			newExchange.getIn().removeHeaders("*");
			newExchange.getIn().setHeader("Authorization", "Bearer " + token);
			newExchange.getIn().setHeader(Exchange.HTTP_METHOD, "POST");
			newExchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
			newExchange.getIn().removeHeader(Exchange.HTTP_URI);
			newExchange.getIn().setHeader("Accept", "*/*");
			newExchange.getIn().setHeader("ResponseStatus", true);
			return newExchange;
		}
	}

}

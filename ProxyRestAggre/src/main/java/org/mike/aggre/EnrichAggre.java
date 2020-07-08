package org.mike.aggre;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.mike.entity.*;
public class EnrichAggre implements AggregationStrategy {

	 
	
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		if(oldExchange == null) {
			return newExchange;
		}
		List<Email> emails  = (List<Email>) newExchange.getIn().getBody();
		StringBuilder sb = new StringBuilder();
		emails.forEach(e -> {
			sb.append("smtps:reportexception.savis@smtp.gmail.com:465?password=exception123&to=");
			sb.append(e.getEmail());
			sb.append(';');
		});
		sb.deleteCharAt(sb.length()-1);
		oldExchange.getIn().setHeader("emails", new String(sb));
		return oldExchange;
	}

}

package org.mike.aggre;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.mike.entity.*;
public class EnrichAggre implements AggregationStrategy {

	private static List<Email> emails = null;
	
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		if(oldExchange == null) {
			return newExchange;
		}
		emails = (List<Email>) newExchange.getIn().getBody();
		oldExchange.getIn().setHeader("idEmail", "0");
		oldExchange.getIn().setHeader("loop", emails.size());
		return oldExchange;
	}
	
	public void addEmailHeader(Exchange exchange) {
		int id = Integer.parseInt(exchange.getIn().getHeader("idEmail").toString());
		if(id < emails.size()) {
			String mail =  emails.get(id++).getEmail();
			System.out.println("sended: " + mail);
			exchange.getIn().setHeader("email",mail);
			exchange.getIn().setHeader("idEmail", ""+id);
			return ; 
		}
		exchange.getIn().setHeader("loop", 0);
	}

}

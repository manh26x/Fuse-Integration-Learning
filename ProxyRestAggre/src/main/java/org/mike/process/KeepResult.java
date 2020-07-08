package org.mike.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class KeepResult implements Processor {

	private Object data = null;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		try {
			
		
		if(exchange.getIn().getHeader("isOke").toString().equals("true")) {
			data = exchange.getIn().getBody();
		} else if(data != null) {
			exchange.getIn().setBody(data);
		}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}

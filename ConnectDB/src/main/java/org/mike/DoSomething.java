package org.mike;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * 
 */

/**
 * @author hungm
 *
 */
public class DoSomething implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String body = (String) exchange.getIn().getBody(String.class);
        System.out.println("body is " + body);
        String header = (String) exchange.getIn().getHeaders().toString();
        System.out.println("header is " + header);
	}

}

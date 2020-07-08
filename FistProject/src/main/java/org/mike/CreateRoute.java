package org.mike;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CreateRoute {
	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		
		MyRouter route = new MyRouter();
		camelContext.addRoutes( new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				
			}
			
		});
		camelContext.start();
	}

}

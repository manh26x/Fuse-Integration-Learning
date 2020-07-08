package org.mike.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class CallSoapRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		 from("direct:start")
		 	.setHeader(Exchange.HTTP_METHOD, constant("POST"))
		 	.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
		    .to("http://ws.cdyne.com/phoneverify/phoneverify.asmx?bridgeEndpoint=true")
		    .unmarshal().jacksonxml()
		    .to("mock:testSoap");
	}

}

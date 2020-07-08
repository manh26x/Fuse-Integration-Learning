/**
 * 
 */
package org.mike;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * @author hungm
 *
 */
public class DoLogin implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		exchange.getIn().setHeader(exchange.HTTP_METHOD, "POST");
		exchange.getIn().setHeader(exchange.CONTENT_TYPE, "application/x-www-form-urlencoded");
		exchange.getIn().removeHeader(exchange.HTTP_URI);
		//exchange.getIn().setBody("username=E7566&password=123");
		System.out.println("header " + exchange.getIn().getHeaders().toString());
		System.out.println("body " + exchange.getIn().getBody());
//		CamelContext context = new DefaultCamelContext();
//		context.addRoutes(new RouteBuilder() {
//
//			@Override
//			public void configure() throws Exception {
//				// TODO Auto-generated method stub
//				from("direct:dologin")
//					.toD("http://0.0.0.0:8080/DepartmentHR/login")
//					.log("oke ${body}");
//			}
//			});
	}
	

}

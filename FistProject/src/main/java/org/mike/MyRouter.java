package org.mike;
import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
//		from("file:src/data?noop=true").to("file:target/messages");
		System.out.println("Hello Word");
	}

}

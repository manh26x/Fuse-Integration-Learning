package org.mike.smtp;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class SendSmtpMail {

	public static void main(String args[]) throws Exception {

		CamelContext context = new DefaultCamelContext();

		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() {

				PropertiesComponent pc = getContext().getComponent(
						"properties", PropertiesComponent.class);
				pc.setLocation("classpath:mail.properties");

				from("direct:start")
				.to("smtp://{{smtp.host}}?username={{smtp.username}}&password={{smtp.password}}&from={{smtp.from.email}}&contentType={{contentType}}")
				.log("Email sent with content ${in.body}");

			}
		});

		// start the route and let it do its work
		
		context.start();
		
		

		ProducerTemplate template = context.createProducerTemplate();
		
		//template.sendBodyAndHeader("direct:start", "Test mail from smtp", "subject", "First Test Mail with content type");
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("to", "hungmanh2607@gmail.com");

		template.sendBodyAndHeaders("smtps://admin@localhost?to=hungmanh2607@gmail.com&password=LamChuyenNh0", "Hello World", headers);
		// stop the CamelContext
		
		context.stop();
	}
}
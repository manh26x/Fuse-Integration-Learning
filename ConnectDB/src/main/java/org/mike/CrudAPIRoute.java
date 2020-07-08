package org.mike;

import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.model.rest.RestBindingMode;
import org.mike.dao.BankAccountDAO;
import org.mike.service.BankService;
public class CrudAPIRoute extends RouteBuilder {

	
	
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		 
		restConfiguration().component("spark-rest")
			.host("localhost").port(8082)
			.bindingMode(RestBindingMode.json)
			.contextPath("/crud_bank");
		rest("/api").bindingMode(RestBindingMode.json)
			.get("/all").route().bean(BankService.class, "findAll").endRest()
				.responseMessage().message("${body}").endResponseMessage()
			.get("/{id}")
				.to("sql:select * from bank_account where id=:#${id}")
				.responseMessage().message("${body}").endResponseMessage();
					
		from("direct:getall")
			.to("sql:select * from bank_account")
				.transform(simple("${body}"));
		
	}
	

}

package org.mike;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.mike.entity.BankAccount;

public class RestProxyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration()
	        .contextPath("/bank/proxy")
	      
	        .component("jetty")
	        .port(9999)
	        .bindingMode(RestBindingMode.json)
	        .dataFormatProperty("prettyPrint", "true");
		
		rest("/api")
			.get("/all").description("get all Bank Accounts")
				.route()
					.setHeader("Content-Type", constant("application/json"))
				    .setHeader("Accept", constant("application/json"))
				    .setHeader(Exchange.HTTP_METHOD, constant("GET"))
				    .removeHeader(Exchange.HTTP_URI)
					.recipientList(simple("http://localhost:8080/BankTransaction/api/all-accounts?bridgeEndpoint=true"))
					.unmarshal().json(JsonLibrary.Jackson)
				.endRest()
			.responseMessage().message("${body}").endResponseMessage()
			.get("/{id}").description("get  Bank Account by id")
				.param()
					.type(RestParamType.path)
					.name("id")
				.endParam()
				.route()
					.setHeader("Content-Type", constant("application/json"))
				    .setHeader("Accept", constant("application/json"))
				    .setHeader(Exchange.HTTP_METHOD, constant("GET"))
				    .removeHeader(Exchange.HTTP_URI)
					.toD("http://localhost:8080/BankTransaction/api/${header.id}?bridgeEndpoint=true")
					.unmarshal().json(JsonLibrary.Jackson)
				.endRest()
				.responseMessage().message("${body}").endResponseMessage()
			.delete("/{id}").description("delete  Bank Account by id")
				.param()
					.type(RestParamType.path)
					.name("id")
				.endParam()
				.route()
					.setHeader("Content-Type", constant("application/json"))
				    .setHeader("Accept", constant("application/json"))
				    .setHeader(Exchange.HTTP_METHOD, constant("DELETE"))
				    .removeHeader(Exchange.HTTP_URI)
					.toD("http://localhost:8080/BankTransaction/api/${header.id}?bridgeEndpoint=true")
					.unmarshal().json(JsonLibrary.Jackson)
				.endRest()
				.responseMessage().message("${body}").endResponseMessage()
			.post().consumes("application/json").produces("application/json").description("create  Bank Account")
				.type(BankAccount.class)
				.route()
					.marshal().json(JsonLibrary.Gson)
					.setHeader("Content-Type", constant("application/json"))
				    .setHeader("Accept", constant("application/json"))
				    .setHeader(Exchange.HTTP_METHOD, constant("POST"))
				    .removeHeader(Exchange.HTTP_URI)
					.to("http://localhost:8080/BankTransaction/api/?bridgeEndpoint=true")
					.unmarshal().json(JsonLibrary.Jackson)
				.endRest()
				.responseMessage().message("${body}").endResponseMessage()
			.put().description("update  Bank Account")
				.type(BankAccount.class)
				.route()
					.marshal().json(JsonLibrary.Gson)
					.setHeader("Content-Type", constant("application/json"))
				    .setHeader("Accept", constant("application/json"))
				    .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
				    .removeHeader(Exchange.HTTP_URI)
					.to("http://localhost:8080/BankTransaction/api/?bridgeEndpoint=true")
					.unmarshal().json(JsonLibrary.Jackson)
				.endRest()
				.responseMessage().message("${body}").endResponseMessage()
			;
		
	}

}

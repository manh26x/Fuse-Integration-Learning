package org.mike.route;









import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.apache.camel.processor.aggregate.AggregateController;
import org.apache.camel.processor.aggregate.DefaultAggregateController;
import org.hibernate.exception.ConstraintViolationException;
import org.mike.aggre.config.PutBankAccountAggregationStrategy;
import org.mike.entity.BankAccount;




public class JpaRoute extends RouteBuilder {

	private AggregateController controller = new DefaultAggregateController();
	private static Long idPut = 1L;
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub

		onException(Exception.class)
		.log("${body}")
		.to("mock:exception");
		onException(ConstraintViolationException.class)
			.setBody().simple("0");
		restConfiguration()
	        .contextPath("/bank/api/v1")
	      
	        .component("jetty")
	        .port(54321)
	        .bindingMode(RestBindingMode.json)
	        .dataFormatProperty("prettyPrint", "true");
		
		rest("/bank")
			.get("/all").description("Find all bank accounts")
				.route()
					.to("direct:findAll")
				.endRest()
			.get("/{id}").description("Test text: hello")
				.param()
					.name("id")
					.type(RestParamType.path)
					.description("id for find bank account")
				.endParam()
				.route()
					.to("direct:findID")
					.log("${body}")
				.endRest()
			.delete("/{id}")
				.param()
					.name("id")
					.type(RestParamType.path)
					.description("id for delete bank account")
				.endParam()
				.route()
					.to("direct:delete")
					.log("${body}")
				.endRest()
				.responseMessage().message("${body}").endResponseMessage()
			.post().consumes("application/json").produces("application/json").description("create bank account")
				.type(BankAccount.class)
				.route() 
					.doTry()
						.to("direct:create")
					.doCatch(Exception.class)
						.setBody().constant(0)
					.end()
				
				.endRest()
				.responseMessage().message("hihih ${body}").endResponseMessage()
			.put().id("put method").consumes("application/json").produces("application/json").description("update bank account")
				.type(BankAccount.class)
				.route() 
					
					.process(exchange-> {
						BankAccount b = (BankAccount) exchange.getIn().getBody();
						exchange.getOut().setHeader("id", b.getId());
						exchange.getOut().setBody(exchange.getIn().getBody());
					})
					.setHeader("idPut").simple(Long.toString(++idPut))
					//.wireTap("direct:keep_data" )
					.log("${body}")
					.to("direct:decide_update","direct:process_id" )
					.delay(header("canUpdate"))
					.choice()
						.when().simple("${header.canUpdate}")
							.setBody().constant("success!")
						.endChoice()
						.otherwise()
							.setBody().constant("EORROR! - id is existed")
						.endChoice()
					.end()
					.setBody().simple("${body}")
				.endRest()
				
			;
		
		from("direct:process_id")
			.to("direct:findID")
			.process(exchange -> {
				if(exchange.getIn().getBody().toString() != "[]") {
					exchange.getOut().setHeader("canUpdate", true);
					exchange.getOut().setHeader("idPut", idPut);
				} else {
					exchange.getOut().setHeader("canUpdate", false);
					exchange.getOut().setHeader("idPut", idPut);
				}
			})
			.to("direct:decide_update");
	
		from("direct:decide_update")
			.aggregate(header("idPut"), new PutBankAccountAggregationStrategy())
			.completionSize(2).id("myAggregator")
		      .aggregateController(controller)
		      .choice()
		      	.when().simple("${header.canUpdate}")
		      		.to("direct:update")
		      	.endChoice()
		      	.otherwise()
		      		.setBody(simple("can't find id"))
		      		.log("fdsfk ${body}")
		      	.endChoice()
		      .end()
		      ;
		from("direct:findID")
			.log("id = ${header.id}")
			.toD("jpa:org.mike.entity.BankAccount?resultClass="+ BankAccount.class.getName() 
					+"&maximumResults=1"
					+"&query=select c from org.mike.entity.BankAccount c  where c.id= ${header.id}")
			.log("${body}");
		
		from("direct:findAll")
			.toD("jpa:org.mike.entity.BankAccount?query=select c from org.mike.entity.BankAccount c")
			.log("${body}");
		
		from("direct:create")
			//.unmarshal().custom("gson")
			.to("jpa:"+BankAccount.class.getName()+"?usePersist=true&flushOnSend=true&joinTransaction=true")
			.log("${body}");
		
		from("direct:update")
			//.unmarshal().custom("gson")
			.to("jpa:"+BankAccount.class.getName()+"?joinTransaction=true")
			.log("${body}");
		
		from("direct:delete")
			.log("id = ${header.id}")
			.toD("jpa:org.mike.entity.BankAccount?query=delete from "+ BankAccount.class.getName()+" c where c.id = ${header.id}")
			.log("${body}");

	}

}

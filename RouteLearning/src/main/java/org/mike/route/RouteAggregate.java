package org.mike.route;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.undertow.UndertowComponent;
import org.apache.camel.language.Bean;
import org.apache.camel.processor.aggregate.AggregateController;
import org.apache.camel.processor.aggregate.DefaultAggregateController;
import org.mike.aggre.config.MyCompletionStrategy;
import org.mike.aggre.config.StringAggregationStrategy;

public class RouteAggregate extends RouteBuilder {
	
	private AggregateController controller = new DefaultAggregateController();

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:start")
		   .aggregate(header("id"), new StringAggregationStrategy())
		      .completionSize(2).id("myAggregator")
		      .aggregateController(controller)
		      .to("mock:aggregated");
	}
	@Bean(ref = "")
	public Component bankApi(CamelContext camelContext, UndertowComponent undertow) {
	    RestOpenApiComponent bankApi = new RestOpenApiComponent(camelContext);
	    bankApi.setSpecificationUri("https://petstore3.swagger.io/api/v3/openapi.json");
	    bankApi.setDelegate(undertow);

	    return bankApi;
	}

}

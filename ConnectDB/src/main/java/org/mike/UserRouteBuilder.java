/**
 * 
 */
package org.mike;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * @author hungm
 *
 */
public class UserRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello");
		// Configure the Camel REST DSL to use the netty4-http component:
		
        restConfiguration().component("netty4-http").bindingMode(RestBindingMode.json)
            // Generate pretty print output:
            .dataFormatProperty("prettyPrint", "true")
            // Set the context path and port number that netty will use:
            .contextPath("/").port(8080)
            // Add the context path for the Swagger-generated API documentation:
            .apiContextPath("/api-doc")
                .apiProperty("api.title", "User API").apiProperty("api.version", "1.2.3")
                // Enable CORS:
                .apiProperty("cors", "true");
        rest("/user").description("User rest service")
	        .consumes("application/json").produces("application/json")
	        .get("/{id}").description("Find user by id").outType(UserLogin.class)
		        .param().name("id").description("The id of the user to get").dataType("int").endParam()
		        .to("bean:userService?method=getUser(${header.id})");

      
	}

}

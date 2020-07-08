package org.mike.process;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.http.HttpComponent;
import org.apache.commons.httpclient.HttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class LoginProcess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		CloseableHttpClient client = HttpClients.createDefault();
		 HttpPost httpPost = new HttpPost("https://onegate.gosign.vn:8243/token");
		 httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
		 httpPost.addHeader("Authorization", "Basic VnlOSjNmS3hpbDdjRG9GdmxXcGV0SjNzcjZRYTpWSWw3SEZZbE5yZ3FSZDZzNnllY2FMSE40UzRh");
		 List <NameValuePair> params = new ArrayList <NameValuePair>();
		 params.add(new BasicNameValuePair("grant_type", "client_credentials"));
		 httpPost.setEntity(new UrlEncodedFormEntity(params));
		 HttpResponse  response = client.execute(httpPost);
		 String responseString = new BasicResponseHandler().handleResponse(response);
		 System.out.println("body" + responseString);
		 
		 int beginIndex = responseString.indexOf(":\"")+2;
		 int endIndex = responseString.indexOf("\",");
		 String token = responseString.subSequence(beginIndex, endIndex).toString();
		 exchange.getIn().removeHeaders("*");
		 exchange.getIn().setHeader("Authorization", "Bearer " + token);
		 exchange.getIn().setHeader(Exchange.HTTP_METHOD, "POST");
		 exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
		 exchange.getIn().removeHeader(Exchange.HTTP_URI);
		 exchange.getIn().setHeader("Accept", "*/*");
		 client.close();
	}

}

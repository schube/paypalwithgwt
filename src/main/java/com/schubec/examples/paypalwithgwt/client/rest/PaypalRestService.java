package com.schubec.examples.paypalwithgwt.client.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.fusesource.restygwt.client.RestService;
import org.fusesource.restygwt.client.TextCallback;


public interface PaypalRestService extends RestService{
	
	public static final String BASEURL = "http://localhost:12345/v1";
	
	@GET
	@Path(BASEURL + "/paypal/getorder/{orderId}")
	@Consumes("application/json")
	void getOrder(@PathParam("orderId") String orderId, TextCallback callback);

	

}

package com.example.rest.service;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.service.pojo.Hello;

@Path("/Hello")
public class HelloWorldService {
	
	@GET
	public Response getHello(){
		return Response.status(200).entity("Hello").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(@Valid Hello hello) {

		System.out.println("Hellow : " + hello.getSame() );
		

		return Response.status(200).entity(hello).build();
	}
}
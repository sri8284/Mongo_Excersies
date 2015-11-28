package com.example.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.database.PersonRepo;
import com.example.service.pojo.Employee;

@Path("/person")
public class PersonService {
	
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response getPerson() {
			return Response.status(200).entity(PersonRepo.getMongoCollection().find()).build();
		}

}

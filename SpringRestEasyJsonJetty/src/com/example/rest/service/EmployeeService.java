package com.example.rest.service;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.service.pojo.Contact;
import com.example.service.pojo.Employee;

@Path("/employee")
public class EmployeeService {
	
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response sayHello(Employee employee) {
			
			/* employee object null condition */
			if(valdiate(employee)){
				return Response.status(201).build();
			}else{
			return Response.status(200).entity(employee).build();
			}
		}

		private boolean valdiate(Employee employee) {
			
			Optional<Employee> emp =  Optional.of(employee);
			
			if(Optional.ofNullable(employee.getEmployeeName()) != null){
				System.out.println();
			}
			
			return true;
			
			
		}
}

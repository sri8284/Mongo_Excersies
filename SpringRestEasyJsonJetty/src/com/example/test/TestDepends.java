package com.example.test;

import com.example.service.pojo.Address;
import com.example.service.pojo.Contact;
import com.example.service.pojo.Employee;
import com.google.gson.Gson;

public class TestDepends {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Address add = new Address();
		add.setLine1("address1");
		add.setLine2("address2");
		
		Contact con = new Contact();
		con.setAddress(add);
		con.setPhoneNo("996652");
		
		emp.setContact(con);
		emp.setEmployeeAge("25");
		emp.setEmployeeName("Sri");
		emp.setEmployeeNo("123");

		Gson gson = new Gson();
		System.out.println("Json Object :"+gson.toJson(emp));
	}
}

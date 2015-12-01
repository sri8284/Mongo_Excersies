package com.sri.employee.process.impl;

import java.util.Set;

import com.sri.employee.exception.EmployeeException;
import com.sri.employee.model.Employee;
import com.sri.employee.process.EmployeeProcess;

public class EmployeeProcessImpl implements EmployeeProcess{

	@Override
	public Employee getEmployeeDetailsById(String employeeId)
			throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> getEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(String employeeId) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

}

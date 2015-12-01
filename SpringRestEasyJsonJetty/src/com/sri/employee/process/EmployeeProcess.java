package com.sri.employee.process;

import java.util.Set;

import com.sri.employee.exception.EmployeeException;
import com.sri.employee.model.Employee;

public interface EmployeeProcess {

	public Employee getEmployeeDetailsById(String employeeId) throws EmployeeException;
	public Set<Employee> getEmployeeDetails() throws EmployeeException;
	public boolean updateEmployee(Employee employee) throws EmployeeException;
	public boolean createEmployee(Employee employee) throws EmployeeException;
	public boolean deleteEmployee(String employeeId) throws EmployeeException;
}

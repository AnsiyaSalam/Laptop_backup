package com.excer.employeeapp.service;

import java.util.List;

import com.excer.employeeapp.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee e);
	public List<Employee> getEmployees_salgrt();
	public void increaseSalary();
	public List<Employee> getAllEmployee();

}

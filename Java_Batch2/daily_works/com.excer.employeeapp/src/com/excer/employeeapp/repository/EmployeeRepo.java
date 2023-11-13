package com.excer.employeeapp.repository;

import java.util.List;

import com.excer.employeeapp.model.Employee;

public interface EmployeeRepo {

	public void addEmployee(Employee e);
	public List<Employee> getEmployees_salgrt();
	public void increaseSalary();
	public List<Employee> getAllEmployee();
}

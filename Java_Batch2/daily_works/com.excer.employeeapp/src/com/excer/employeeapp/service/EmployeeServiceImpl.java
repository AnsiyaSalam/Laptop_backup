package com.excer.employeeapp.service;

import java.util.List;

import com.excer.employeeapp.model.Employee;
import com.excer.employeeapp.repository.EmployeeRepo;
import com.excer.employeeapp.repository.EmployeeRepoImpl;

	public class EmployeeServiceImpl implements EmployeeService{
	EmployeeRepo employeerepo = (EmployeeRepo) new EmployeeRepoImpl();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeerepo.addEmployee(e);
		
	}

	@Override
	public List<Employee> getEmployees_salgrt() {
		// TODO Auto-generated method stub
		return employeerepo.getEmployees_salgrt();
	}

	@Override
	public void increaseSalary() {
		// TODO Auto-generated method stub
		employeerepo.increaseSalary();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeerepo.getAllEmployee();
	}	
	

}

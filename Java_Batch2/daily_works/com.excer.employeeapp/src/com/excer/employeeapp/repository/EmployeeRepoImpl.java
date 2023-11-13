package com.excer.employeeapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.excer.employeeapp.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	List<Employee> employees = new ArrayList<>();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employees.add(e);
	}

	@Override
	public List<Employee> getEmployees_salgrt() {
		// TODO Auto-generated method stub
		List<Employee> s= new ArrayList<>();
		for(Employee e:employees)
		{
			if(e.getSalary()>=40000)
			{
				s.add(e);
			}
		}
		return s;
	}

	@Override
	public void increaseSalary() {
		// TODO Auto-generated method stub
		List<Employee> s= new ArrayList<>();
		for(Employee e:employees)
		{
			if(e.getSalary()>=50000)
			{
				double sal=e.getSalary()*10/100;
				e.setSalary(sal);
				s.add(e);
			}
		}
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}

}

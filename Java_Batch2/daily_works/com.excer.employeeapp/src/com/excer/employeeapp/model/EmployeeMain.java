package com.excer.employeeapp.model;

import java.util.List;
import java.util.Scanner;
import com.excer.employeeapp.exception.InvalidUserInputException;
import com.excer.employeeapp.model.Employee;
import com.excer.employeeapp.service.EmployeeService;
import com.excer.employeeapp.service.EmployeeServiceImpl;
public class EmployeeMain {
	static Scanner sc = new Scanner(System.in);
	static EmployeeService employeeservice = new EmployeeServiceImpl();
	public static void insertEmployee()throws InvalidUserInputException
	{

			System.out.println("enter the employee id:");
			long id = sc.nextLong();
			if (id <= 10000)
			{
				throw new InvalidUserInputException("The employee id have five or more than five positive integer");
				}
			System.out.println("enter the employee Name");
			String name = sc.next();
			if (name.length() <= 3)
			{
				throw new InvalidUserInputException("The employee name have minimum 3 character");
				}
			System.out.println("enter the employee salary");
			double salary = sc.nextDouble();
			if (salary <= 10000)
			{
				throw new InvalidUserInputException("The employee salary is must greater than 10000");
				}
			else if (salary >= 200000)
			{
				throw new InvalidUserInputException("The employee salary is must less than 200000");
				}
			Employee e1 = new Employee(id, name, salary);
			employeeservice.addEmployee(e1);
			System.out.println("Employee added succesfully");
			}

	public static void displayAllEmployee()
	{
		List<Employee> e2 = employeeservice.getAllEmployee();
		System.out.println(e2);
		}
	public static void findEmployees()
	{
		List<Employee> e2 = employeeservice.getEmployees_salgrt();
		System.out.println(e2);
		}
	public static void increaseSal()
	{
		employeeservice.increaseSalary();
		}
	public static void main(String []args){
		while (true)
	{
		System.out.println("1.add employee \n2.display All employee \n3.display_sgr4t \n4.increase salary");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch (ch)
		{
		case 1:
			try {
				insertEmployee();
			} catch (InvalidUserInputException e) {
				
				System.err.println(e.getMessage());
			}
			break;
			case 2:
				displayAllEmployee();
				break;
				case 3:
					findEmployees();
					case 4:
						increaseSal();
						break;
						default:
							System.out.println("eneter a invalid choice");
							}
		}
	}
	}
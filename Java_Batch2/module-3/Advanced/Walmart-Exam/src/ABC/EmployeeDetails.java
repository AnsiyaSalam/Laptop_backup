package ABC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ansiya", 23, 1, 23000, "IT"));
        employees.add(new Employee("Ashwin", 24, 2, 33000, "Developer"));
        employees.add(new Employee("Sidharth", 23, 1, 23000, "IT"));
        employees.add(new Employee("Althaf", 23, 1, 20000, "Engineer"));

        
        long totalEmployees = employees.stream().count();

       
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();

        
        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

       
        List<Employee> employeesSortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());

        
        List<Employee> employeesSortedByExperience = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .collect(Collectors.toList());

        
        System.out.println("Total number of employees: " + totalEmployees);
        System.out.println("Employees by department: " + employeesByDepartment);
        System.out.println("Total salary paid to all employees: " + totalSalary);
        System.out.println("Total salary paid by department: " + totalSalaryByDepartment);
        System.out.println("Employees sorted by age: " + employeesSortedByAge);
        System.out.println("Employees sorted by experience: " + employeesSortedByExperience);
    }
}

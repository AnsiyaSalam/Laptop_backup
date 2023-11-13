package Customer;

import java.util.List;

public class CustomerApp {
	
	public static void main(String[] args) {
		
		CustomerRepository cr= new CustomerRepository();
		
		//create a customer object
		Customer c1=new Customer(101,"Raju","raju@gmai.com");
		Customer c2=new Customer(102,"Kiran","kiran@gmai.com");
		Customer c3=new Customer(103,"Kalyani","kalyani@gmai.com");
		Customer c4=new Customer(104,"Pathu","pathu@gmai.com");
		
		//Adding new customer
		cr.addCustomer(c1);
		cr.addCustomer(c2);
		cr.addCustomer(c3);
		cr.addCustomer(c4);
		
		cr.deleteCustomer(102);
		
       //getting all the customers
		
		List<Customer> customers=cr.getAllCustomer();
		
		//display all the customers
		
		for(Customer c:customers)
		{
			System.out.println(c);
		}
		
	}

}

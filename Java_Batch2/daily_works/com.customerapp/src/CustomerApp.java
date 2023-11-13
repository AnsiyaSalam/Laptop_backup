import java.util.Scanner;
import java.util.List;

import com.customerapp.model.Customer;
import com.customerapp.service.CustomerServiceImpl;


public class CustomerApp {
	
	static Scanner sc=new Scanner(System.in);
	static CustomerServiceImpl cs=new CustomerServiceImpl();

	public static void insertCustomer(){
		// TODO Auto-generated method stub
		
		System.out.println("Enter the customer details:-");
		System.out.print("Customer Id: ");
		int id=sc.nextInt();
		System.out.print("Customer Name: ");
		String name=sc.next()+sc.nextLine();
		System.out.print("Email Id: ");
		String email=sc.next()+sc.nextLine();
		
		Customer c=new Customer(id,name,email);
		cs.addCustomer(c);
		System.out.println("Successfully added");

	}
	
	public static void searchCustomer()
	{
		System.out.println("Enter the customer id to search");
		int a=sc.nextInt();
		Customer s=cs.getCustomerById(a);
		System.out.println(s);
	}
	
	public static void removeCustomer()
	{
		System.out.println("Enter the customer id to delete");
		int b=sc.nextInt();
		cs.deleteCustomer(b);
		System.out.println("Deleted successfully");
	}
	
	public static void displayAllCustomer()
	{
		List<Customer> c1=cs.getAllCustomer();
		for(Customer t1:c1)
		{
			System.out.println(t1);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1.Adding Cutsomer \n 2.Search Customer \n 3.Delete Customer \n 0.Exit");
			System.out.println("Enter the choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				insertCustomer();
				break;
			case 2:
				searchCustomer();
				break;
			case 3:	
				removeCustomer();
				break;
			case 4:
				displayAllCustomer();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

}

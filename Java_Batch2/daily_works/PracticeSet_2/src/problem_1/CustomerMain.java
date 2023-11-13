package problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CustomerMain {

	public static void main(String args[]) throws IOException, NumberFormatException, ParseException 
	{
	
		
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Customer c[]=new Customer[2];
	for(int i=0;i<2;i++){
	System.out.println("Enter the details of Customer "+(i+1)+":");
	String cd=br.readLine();
	String s[]=cd.split(",");
	c[i]=new 
	Customer(Long.parseLong(s[0]),s[1],s[2],sdf.parse(s[3]),Double.parseDouble(s[4]),Double.parseDouble
	(s[5]),sdf.parse(s[6]),Double.parseDouble(s[7]));
	}
	int idd=1;
	for(Customer cus:c)
	{
	System.out.println("Details of customer "+(idd)+":");
	System.out.println(cus);
	idd++;
	}
	if(c[0].equals(c[1]))
	{
	System.out.println("Customer 1 is same as Customer 2");
	}
	else
	System.out.println("Customer 1 and Customer 2 are different");
	}


}

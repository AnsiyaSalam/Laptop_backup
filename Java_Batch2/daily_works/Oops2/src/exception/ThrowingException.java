package exception;

import java.util.Scanner;

public class ThrowingException {
	
	static int age;
	public static void readUser() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age <= 0)
		{
			throw new Exception("Age should be positive values");
		}
	}
	public static void main(String[] args) {
		try
		{
			readUser();
			System.out.println("Age = "+age);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

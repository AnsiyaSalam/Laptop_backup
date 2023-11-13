package exception;

import java.util.Scanner;

public class ThrowingException2 {
	
	static String name;
	public static void readStringLength() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		
		if(name.length()<3)
		{
			throw new Exception("Length should be greater than 3");
		}
		else
		{
			System.out.println(name.length());
		}
	
	}
	public static void main(String[] args) {
		try
		{
			readStringLength();
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
	}

}

package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileReader reader= new FileReader("hello.txt");
			Scanner sc=new Scanner(reader);
			String line=sc.nextLine();
			System.out.println(line);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}

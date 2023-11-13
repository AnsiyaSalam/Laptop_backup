package filesjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteEvenNumber {
	
	public static void main(String []args) {
		
		FileReader reader=null;
		FileWriter writer1=null;
		FileWriter writer2=null;
		Scanner sc=null;
		
		
		try
		{
			reader = new FileReader("number.txt");
			sc = new Scanner(reader);
			
			writer1 = new FileWriter("odd.txt",true);
			writer2 = new FileWriter("even.txt",true);
		
			while(sc.hasNextInt())
			{
				int num=sc.nextInt();
				if(num%2 != 0)
				{
                    writer1.write(num+" ");
				}
				else
				{
                    writer2.write(num+" ");
				}
		}
	}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				sc.close();
				reader.close();
				writer1.close();
				writer2.close();
			}
			catch(IOException e2)
			{
				e2.printStackTrace();
			}
		}
	}	
}
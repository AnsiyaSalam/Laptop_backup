package filesjava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {
	
	public static void main(String[] args) {
		
		FileWriter writer=null;
		Scanner sc=new Scanner(System.in);
		try
		{
			writer = new FileWriter("data.txt");
			String line="ust is loctaed in tvm";
			
			writer.write(line);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}

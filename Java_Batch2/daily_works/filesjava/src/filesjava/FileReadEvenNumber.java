package filesjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			// opening a file in read mode
			FileReader reader =new FileReader("C:\\Users\\248739\\Documents\\workspace-spring-tool-suite-4-4.2.1.RELEASE\\filesjava\\src\\filesjava\\hello.txt");
			Scanner sc=new Scanner(reader);
			
			while(sc.hasNext())
			{
				int num=sc.nextInt();
				if(num%2==0)
				{
				System.out.println(num);
				}
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}

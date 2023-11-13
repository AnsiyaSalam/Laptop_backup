package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationReadDemo {
	
	public static void main(String []args) {
		
		FileInputStream inputStream=null;
		ObjectInputStream inputObjectStream=null;
		try {
			inputStream=new FileInputStream("employee.data");
			inputObjectStream=new ObjectInputStream(inputStream);
			Employee emp=(Employee)inputObjectStream.readObject();
			System.out.println(emp);
			}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				inputStream.close();
				inputObjectStream.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}

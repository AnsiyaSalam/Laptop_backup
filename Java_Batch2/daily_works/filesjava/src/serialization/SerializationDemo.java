package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =new Employee(1,"Ansiya Salam",5000);
		FileOutputStream outputStream=null;
		ObjectOutputStream objectOutputStream=null;
		try
		{
			outputStream = new FileOutputStream("employee.data");
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(emp);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				outputStream.close();
				objectOutputStream.close();
			}
			catch(IOException e)
			{
				System.err.println(e);
			}
		}

	}

}

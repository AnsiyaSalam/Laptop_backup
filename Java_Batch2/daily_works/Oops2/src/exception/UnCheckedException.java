package exception;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[]= {2,4,5,6,7,8};
	try
	{
		for(int i=0; i<8; i++)
		{
			System.out.println(arr[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println(ex.getMessage());
	}
	
	
	
	}

}

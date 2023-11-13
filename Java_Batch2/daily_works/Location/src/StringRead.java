import java.util.Scanner;

public class StringRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str="name: ansiya, age: 23, location: thodupuzha";
		int index=str.indexOf("location");
		System.out.println("String is:-	 \n"+str.substring(index));
		
        
	}
}
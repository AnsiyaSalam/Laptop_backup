package problem_9;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		String idstr  = sc.nextLine();
		
		System.out.println("location");
		String locationstr = sc.nextLine();
		
		String result = UserMainCode9.validateIDLocations(idstr, locationstr);
		System.out.println(result);
		sc.close();
	}
}

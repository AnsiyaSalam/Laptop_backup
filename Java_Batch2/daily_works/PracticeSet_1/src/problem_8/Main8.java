package problem_8;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("previous reading");
		String prevReadingStr = sc.nextLine();
		
		System.out.println("current reading");
		String currReadingStr = sc.nextLine();
		
		System.out.println("perunit charge");
		int perUnitCharge = sc.nextInt();
		
		int prevReading = Integer.parseInt(prevReadingStr.substring(5));
		
	    int currReading = Integer.parseInt(currReadingStr.substring(5));

	    int billAmount = UserMainCode8.calculateElectricityBill(prevReading, currReading, perUnitCharge);
	    
	    System.out.println(billAmount);
	}

}

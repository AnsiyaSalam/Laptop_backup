package problem_4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dd/mm/yyyy");
		String str = sc.nextLine();
		if(UserMainCode4.validateDate(str)==1)
		{
			System.out.println("Valid date format");
		}
		else
		{
			System.out.println("Invalid date format");
		}

	}
}

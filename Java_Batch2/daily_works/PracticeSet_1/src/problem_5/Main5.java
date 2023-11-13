package problem_5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time");
		String str = sc.nextLine();
		if(UserMainCode5.validateTime(str)== 1)
		{
			System.out.println("Valid time");
        } 
		else
		{
            System.out.println("Invalid time");
        
		}
		
	}

}

package problem_6;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the password");
		String str=sc.nextLine();
		if(UserMainCode6.validatePassword(str)== 1)
		{
			System.out.println("Valid password");
        } 
		else
		{
            System.out.println("Invalid password");
        
		}
	}

}

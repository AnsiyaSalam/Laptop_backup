package problem_2;

import java.util.Scanner;

import problem_2.UserMainCode2;

public class Mian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next()+sc.nextLine();
		System.out.println(UserMainCode2.checkCharacter(str));
	}

}

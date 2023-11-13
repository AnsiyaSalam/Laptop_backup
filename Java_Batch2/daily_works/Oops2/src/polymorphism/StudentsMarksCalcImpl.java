
package polymorphism;

import java.util.Scanner;

public class StudentsMarksCalcImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maths,bio,chemistry,physics;
		
		Scanner sc=new Scanner(System.in);
		
		StudentsMark s=new StudentsMark();
		
		
		System.out.println("\n 1. Medical stream \n 2. Non-medical stream");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.print("Maths mark = ");
			maths=sc.nextInt();
			System.out.print("Bio mark = ");
			bio=sc.nextInt();
			System.out.print("Chemistry mark = ");
			chemistry=sc.nextInt();
			System.out.print("Physics mark = ");
			physics=sc.nextInt();
			var r1=s.calculateMarks(maths,physics,chemistry,bio);
			System.out.println("medical mark"+r1);
			break;
			
		case 2:
			System.out.print("Maths mark = ");
			maths=sc.nextInt();
			System.out.print("Chemistry mark = ");
			chemistry=sc.nextInt();
			System.out.print("Physics mark = ");
			physics=sc.nextInt();
			var r2=s.calculateMarks(maths,physics,chemistry);
			System.out.println(r2);
			break;
			
		
		default:
			System.out.println("Invalid");
			break;
			
		}
		
		
	}

}


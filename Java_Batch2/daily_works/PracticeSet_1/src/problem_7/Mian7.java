package problem_7;

import java.util.Scanner;

public class Mian7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		 for (int i = 0; i < n; i++) {
		      arr[i] = sc.nextInt();
		    }
		System.out.println(UserMainCode7.getBigDiff(arr));
	}

}

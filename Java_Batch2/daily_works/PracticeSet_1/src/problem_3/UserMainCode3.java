package problem_3;

public class UserMainCode3 {
	
	public static void reverseNumber(int num)
	{
		int rev = 0;
		while(num>0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}

}

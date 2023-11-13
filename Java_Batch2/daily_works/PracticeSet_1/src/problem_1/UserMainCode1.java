package problem_1;

public class UserMainCode1 {
	
	public static void checkSum(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			int a = num % 10;
			num = num/10;
			if(a % 2 != 0)
				sum = sum + a;
		}
		if(sum == 0)
		{
			System.out.println("sum is even");
		}
		else if(sum % 2 == 0)
		{
			System.out.println("sum is even");
		}
		else
		{
			System.out.println("sum is odd");
		}
	}	
}

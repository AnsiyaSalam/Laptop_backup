package Exercise_2;

import java.util.Scanner;

public class ArrayRev {
	public static int[] revArray(int[] arr,int len)
	{
		int[] output = new int[len];
		
		for(int i=0; i<len; i++)
		{
			int rev=0;
			int temp = arr[i];
			while(temp>0)
			{
				int r=temp%10;
				rev=rev*10+r;
				temp=temp/10;
			}
			output[i] = rev;
		}
		return output;
	}
	public static int[] sortArray(int[] arr, int len)
	{
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		int len =sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		int[] arr=new int[len];
		
		for(int i=0; i<len; i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] revArr = revArray(arr,len);
		int[] sortArr= sortArray(revArr,len);
		
		System.out.println("\n The reversed sorted array is \n");
		for(int num :sortArr)
		{
			System.out.println(num);
		}
	}

}

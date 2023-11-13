import java.util.Scanner;
import java.util.*;

class ArrayAverage {
	
	public int[] getArrayValues()
	{
		System.out.println("Enter number of values : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the values : ");
		int []array=new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		return array;	
	}
	public String findAverage(int[] array)
	{
		int sum=0, check=0;
		float avg=0;
		String output="";
		for(int item:array)
		{
			if(item<0)
			{
				check++;
			}
			else
			{
				sum += item;
			}
		}
		if(array.length==0)
		{
			output="Array is empty";
		}
		else if(check > 0)
		{
			output="Give proper positive integer values";
		}
		else
		{
			int k=array.length;
			 avg=sum/k;
			output="The average value is : "+avg;
		}
		return output;
	}

}

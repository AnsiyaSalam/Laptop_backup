package logicalOperators;

import java.util.Scanner;

public class LogicalOperation {
	
		
		public static int getSecondLargest(int[] arr)
		{

		 int large = 0;
		 int secLarg =0;
		 for (int i=0;i<arr.length;i++) 
		 {
		      if (i > large) 
		      {
		        secLarg = large;
		        large = i;
		      } 
		      else if (i > secLarg && i != large) 
		      {
		        secLarg = i;
		      }
		    }
		   return secLarg;
		 }
		
		 
		 public static int getSumOfOddNumbers(int[] arr)
		 {
		    int odd=0;
		    for(int i=0;i<arr.length;i++) 
		    {
		        if(i%2==1)
		        {
		            odd= odd +i;
		        }
		   }
		   return odd;
		}
		 
		 
	    public static int getNumberOfPrimes(int[] arr) 
	    {    
		   for(int i=0;i<arr.length;i++ ) 
		   {
		       if(i<=1) 
		       {
		          return -1;
		       }
		
	       }
		return 1;
        }
	    
	    
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the set of numbers");
		int large = sc.nextInt();
		int secLarg = sc.nextInt();
	}
	
}


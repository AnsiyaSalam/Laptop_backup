package com.stackroute.basics;

import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
    	
    	Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	int arr[]=new int[size];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	String str=findAverage(arr);
    	System.out.println(str);

    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
    	
    	int sum=0;
    	if(inputArray.length==0)
    	{
    		return "Empty array";
    	}
        for(int s:inputArray)
        {
        	if(s<0)
        	{
        	return "Give proper positive integer values";	
        	}
        	sum=s+sum;
        }
        int k=inputArray.length;
        int average=sum/k;
        return "The average value is: " +average;
    }
}

package ArrayListProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		Collection<Integer> items=new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			int a=sc.nextInt();
			items.add(a);
		}
		for(int s:items)
		{
			System.out.println(s+" ");
		}
	}

}

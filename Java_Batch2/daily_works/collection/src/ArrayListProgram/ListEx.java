package ArrayListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> names=new ArrayList<>();
		List<String> names=Arrays.asList("Harsh","Rohit","Suraj","Rahul","Manish");
		
		
//		names.add("Harsh");
//	    names.add("Suraj");
//		names.add("Priya");
//		names.add("Manish");
//		names.add(1,"Rohit"); //Insert a new name in the !st index
//		names.remove(2); //remove index 2 
		
		System.out.println(names);
		int total=names.size();
		System.out.println("Total items : "+total);
		
		//How to start
		Collections.sort(names);
		
		System.out.println(names);
		
		boolean checkName = names.contains("Manish");
		System.out.println(checkName);
		
		System.out.println(names.get(3));

	}

}

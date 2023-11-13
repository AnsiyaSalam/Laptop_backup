import java.util.*;
 
public class LongestSubstring {
	
	public String appearlnBothEnds(String stng)
	{
		int A = stng.length();
		String f_str="";
		String tmp="";
		
		for(int i=0; i< A; i++)
		{
			tmp += stng.charAt(i);
			int t_len = tmp.length();
			
			if(i< A/2 && tmp.equals(stng.substring(A-t_len,A)))
				f_str = tmp;
		}
		return f_str;
	}
	public static void main(String []args){
		
		
		LongestSubstring m=new LongestSubstring();
		String str1= "playersplay";
		System.out.println("The given string is :"+str1);
		System.out.println("The longest substring in the string is : "+m.appearlnBothEnds(str1));

	}

}

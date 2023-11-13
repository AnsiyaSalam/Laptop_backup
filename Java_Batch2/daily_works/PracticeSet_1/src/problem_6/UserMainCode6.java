package problem_6;

public class UserMainCode6 {

	public static int validatePassword(String str) {
		// TODO Auto-generated method stub
		
		 if(str.matches(".*[0-9]{1,}.*") && str.matches(".*[@#$]{1,}.*") && str.length() >=6 && str.length()<=20)
		 {
	        return  1;
	     }
	     else
	     {
	        return -1;
	     }
	   }
	}
	





	
package problem_5;

public class UserMainCode5 {

	public static int validateTime(String str) {
		// TODO Auto-generated method stub
		
		
			if(str.matches("[0-12]{2}[:]{1}[0-60]{2}\\s{1}((AM)||(PM)||(am)||(pm))"))
			
			{
				return 1;
			}
		
		return -1;
	}

}

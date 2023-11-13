package problem_4;

public class UserMainCode4 {

	public static int validateDate(String str) {
		// TODO Auto-generated method stub
		
		
			if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
			{
				return 1;
			}
		return -1;		
	}
}

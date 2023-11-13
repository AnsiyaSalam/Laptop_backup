package problem_2;

public class UserMainCode2 {
	
	public static int checkCharacter(String str)
	{
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			return 1;
		}
		return -1;
	}


}

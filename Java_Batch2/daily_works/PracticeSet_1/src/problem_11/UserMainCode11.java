package problem_11;

public class UserMainCode11 {

	public static boolean validatePhone(String phno)
	{
		
		if(phno.matches("(?!00)\\d{10}"))
		{
			return true;
		}
		return false;
	}
}

package problem_9;

public class UserMainCode9 {

	public static String validateIDLocations(String idstr, String locationstr) {
		// TODO Auto-generated method stub
		
		String str[] = idstr.split("-");
		String loc = locationstr.substring(0,3);
		if(str[0].equals("UST") && str[1].equals(loc) && str[2].length()==4)
		{
			return "Valid ID";
		}
		return "Not Valid";
	}
}

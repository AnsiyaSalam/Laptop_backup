package problem_10;

public class UserMainCode10 {

	public static String swapCharacter(String str) {
		// TODO Auto-generated method stub
		
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for(int i=0; i<length-1; i=i+2)
		{
			char temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1] = temp;
		}
		return new String(charArray);
	}

}

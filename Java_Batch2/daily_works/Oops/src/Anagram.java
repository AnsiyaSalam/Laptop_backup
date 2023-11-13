import java.util.Arrays;

public class Anagram {
	
	String string1;
	String string2;
	
	String checkAnagram(String string1, String string2)
	{
		String s=" ";
		if(string1.length()==string2.length())
		{
			char[] s1=string1.toCharArray();
			char[] s2=string2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			for(int i=0;i<s1.length;i++)
			{
				if(s1[i]==s2[i])
				{
					s="Given phrase are  anagram";
				}
				else
				{
					s="Given are not anagram 1";
				}
			}
		}
		else
		{
			s="Given phrase are not anagram";
		}
		return s;
	}
}
	


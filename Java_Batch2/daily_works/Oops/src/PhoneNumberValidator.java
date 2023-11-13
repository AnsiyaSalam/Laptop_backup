import java.util.Scanner;

public class PhoneNumberValidator{
	private String phoneNumber;
	PhoneNumberValidator(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	boolean validatePhoneNumber(String phoneNumber)
	{
		boolean s=true;
		int count=0;
		if(phoneNumber.length()>=10)
		{
			for(int i=0;i<phoneNumber.length();i++)
			{
				char d=phoneNumber.charAt(i);
				if(d=='0' || d=='1' || d=='2' || d=='3' || d=='4' || d=='5' || d=='6' || d=='7' || d=='8' || d=='9')
					{
					count++;
					}
				if(d=='0' || d=='1' || d=='2' || d=='3' || d=='4' || d=='5' || d=='6' || d=='7' || d=='8' || d=='9' || d=='-')
				{
					s=true;
				}
				else
				{
					s=false;
				}
			}
			if(s==true && count==10)
			{
				s=true;
			}
			else
				
			{
				s=false;
			}
		}
		else
		{
			s=false;
		}
		return s;
	}
	void display()
	{
		boolean t=validatePhoneNumber(phoneNumber);
		if(t)
		{
			System.out.println("Valid");
		}
			else
		{
			System.out.println("Invalid");
		}
	}
}

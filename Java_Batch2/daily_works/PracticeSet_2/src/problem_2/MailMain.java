package problem_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailMain {
	
	static Scanner sc = new Scanner(System.in);
	static MailFolder mf = new MailFolder();
	static String folder;
	static List<Mail> m = new ArrayList<>();
	public static void addMail() throws IOException, NumberFormatException,ParseException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the details");
		String detials = br.readLine();
		m.add(Mail.createMail(detials));
		mf = new MailFolder(folder, m);
		System.out.println("Successfully added");
	}
	
	 public static void display()
	 {
		 try
		 {
			 mf.displayMails();
		 }
		 catch(NullPointerException e )
		 {
			 System.err.println("No mail to show");
		 }
		 
	 }
		 
	 
	 public static void deleteMail(long id)
	 {
		 boolean flag = mf.removeMailFromFolder(id);
		 if(flag)
			 System.out.println("Deleted the item");
		 else
			 System.out.println("No item with id entered!");
	 }
	

	public static void main(String[] args) throws NumberFormatException,IOException,ParseException{
		// TODO Auto-generated method stub

		System.out.println("Enter the name of folder");
		folder = sc.next();
		while(true)
		{
			System.out.println("1. Add Mail \n2. DeleteMAil \n3. Display Mails \n4. Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				addMail();
				break;
			case 2:
				System.out.println("Enter the id to remove");
				Long id = sc.nextLong();
				deleteMail(id);
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
		
	}

}

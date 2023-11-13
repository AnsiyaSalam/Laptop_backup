package problem_2;

import java.util.ArrayList;
import java.util.List;

public class MailFolder {
	private String name;
	private List<Mail> mailList;
	
	public MailFolder()
	{
		String name = "null";
		List<Mail> mailList = new ArrayList<>();
	}
	
	public MailFolder(String name, List<Mail> mailList) {
		super();
		this.name = name;
		this.mailList = mailList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mail> getMailList() {
		return mailList;
	}

	public void setMailList(List<Mail> mailList) {
		this.mailList = mailList;
	}
	
	public void addMailToFolder(Mail mail)
	{
		mailList.add(mail);
	}
	
	public Boolean removeMailFromFolder(Long id)
	{
		for(Mail m: mailList)
		{
			if(m.getId()==id)
			{
				mailList.remove(m);
				return true;
			}
		}
		return false;
	}
    
	public void displayMails()
	{
		if(mailList.isEmpty())
			System.out.println("No mail is found");
		else
		{
			System.out.println("Mail in "+getName());
			System.out.println("Mails in "+getName());
			System.out.println(String.format("%-10s%-15s%-15s%-15s%-20s%-15s%-10s\n", 
					"Id","From","To","Subject","Content","ReceivedDate","Size"));
			for(Mail m:mailList)
			{
				System.out.println(m);
			}
		}
	}
	

}

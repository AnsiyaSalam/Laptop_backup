package problem_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mail {
	
	private long id;
	private String from;
	private String to;
	private String subject;
	private String content;
	private Date receivedDate;
	private double size;

	public Mail(long id, String from, String to, String subject, String content, Date receivedDate, double size) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.receivedDate = receivedDate;
		this.size = size;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
    public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}

	
	@Override
	public String toString() 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-10s%-15s%-15s%-15s%-20s%-15s%-10s\n", 
				id,from,to,subject,content,sdf.format(receivedDate),size);
	}

	public static Mail createMail(String detail) throws NumberFormatException,ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s[] = detail.split(",");
		return new Mail(Long.parseLong(s[0]),s[1],s[2],s[3],s[4],sdf.parse(s[5]),Double.parseDouble(s[6]));
		

	}

}

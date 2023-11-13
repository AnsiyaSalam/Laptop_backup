package inheritance;

public class JournalPaper extends WrittenItem {
	private int year;
	
	public JournalPaper(int Id_Number,String title,int numberOfCopies,String author,int year)
	{
		super(Id_Number,title,numberOfCopies,author);
		this.year=year;
	}
	void print()
	{
		super.print();
		System.out.println("Year published = "+year);
	}
}

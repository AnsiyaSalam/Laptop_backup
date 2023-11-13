package inheritance;

public class Book extends WrittenItem{
	public Book(int Id_Number,String title,int numberOfCopies,String author)
	{
		super(Id_Number,title,numberOfCopies,author);
	}
	void print()
	{
		super.print();
	}
	

}

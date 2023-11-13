package inheritance;

public class WrittenItem extends Item{
	
	private String author;
	public WrittenItem(int Id_Number,String title,int numberOfCopies,String author)
	{
		super(Id_Number,title,numberOfCopies);
		this.author=author;
	}
	void print()
	{
		super.print();
		System.out.println("Author name = "+author);
	}
}

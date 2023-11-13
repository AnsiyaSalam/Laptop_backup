package abstraction;

public abstract class WrittenItem extends Item {
	private String author;
	public WrittenItem(int idNo,String title,int noOfCopies,String author)
	{
		super(idNo,title,noOfCopies);
		this.author=author;
		
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor()
	{
		this.author=author;
	}
	public void print()
	{
		super.print();
		System.out.println("Author Name:"+author);
	}

}

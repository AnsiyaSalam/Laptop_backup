package abstraction;

public class Book extends WrittenItem{
	public Book(int idNo,String title,int noOfCopies,String author)
	{
		super(idNo,title,noOfCopies,author);
	}
	public void print()
	{
		super.print();
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Book checked in");
		
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("book check out");
		
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
		System.out.println("Book added");
		
	}
	

}

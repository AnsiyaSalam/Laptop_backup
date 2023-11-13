package abstraction;

public class JournelPapper extends WrittenItem {
	private String yop;
	public JournelPapper(int idNo,String title,int noOfCopies,String author,String yop)
	{
		super(idNo,title,noOfCopies,author);
		this.yop=yop;
		
		
	}
	public String getYop()
	{
		return yop;
		
	}
	public void setYop(String yop)
	{
		this.yop=yop;
		
	}
	public void print()
	{
		super.print();
		System.out.println("year of publishing: "+yop);
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

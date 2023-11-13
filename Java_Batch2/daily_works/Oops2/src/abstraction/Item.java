package abstraction;

public abstract class Item {
	private int idNo;
	private String title;
	private int noOfCopies;
	
	public Item(int idNo, String title, int noOfCopies) {
		super();
		this.idNo = idNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public void print()
	{
		System.out.println("item id Number: "+idNo);
		System.out.println("item title is: "+title);
		System.out.println("The number of copies: "+noOfCopies);
	}
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	
	

}

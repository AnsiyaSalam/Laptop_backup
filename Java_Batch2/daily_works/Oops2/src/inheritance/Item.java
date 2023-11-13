package inheritance;

public class Item {
	private int Id_Number;
	private String title;
	private int numberOfCopies;

	public Item(int id_Number, String title, int numberOfCopies) {
		super();
		this.Id_Number = id_Number;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
		
	}
	
	
	public int getId_Number() {
		return Id_Number;
	}


	public void setId_Number(int id_Number) {
		Id_Number = id_Number;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}


    void print()
	{
		System.out.println("Id_Number = "+Id_Number);
		System.out.println("Title = "+title);
		System.out.println("No of Copies = "+numberOfCopies);
	}
	void checkIn()
	{
		
	}
	void checkOut()
	{
		
	}
	

}

package inheritance;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	
	
	public Video(int Id_Number, String title, int numberOfCopies) {
		super(Id_Number, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	

	void print()
	{
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year Released : "+year);
	}

}

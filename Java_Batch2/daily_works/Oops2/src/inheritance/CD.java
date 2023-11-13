package inheritance;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	
	public CD(int Id_Number,String title,int numberOfCopies,String artist,String genre)
	{
		super(Id_Number,title,numberOfCopies);
		this.artist=artist;
		this.genre=genre;
	}
	
	void print()
	{
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
	
	}

}

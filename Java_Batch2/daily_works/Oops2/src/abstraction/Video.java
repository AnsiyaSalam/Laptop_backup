package abstraction;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int yor;
	public Video(int idNo,String title,int noOfCopies,int runTime,String director,String genre,int yor)
	{
		super(idNo,title,noOfCopies,runTime);
		this.director=director;
		this.genre=genre;
		this.yor=yor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYor() {
		return yor;
	}
	public void setYor(int yor) {
		this.yor = yor;
	}

	public void print()
	{
		super.print();
		System.out.println("director name: "+director);
		System.out.println("categor: "+genre);
		System.out.println("year :"+yor);
	}
}


public class Book {
	int isbnNo;
    String bookName;
    String author;
    String genre;
    double price;
    
    Book(int isbnNo,  String bookName, String author, String genre, double price)
    {
    	this.isbnNo=isbnNo;
    	this.bookName=bookName;
    	this.author=author;
    	this.genre=genre;
    	this.price=price;
    }
    
    void printBook()
    {
    	System.out.println("isbnNo : "+this.isbnNo);
    	System.out.println("bookName : "+this.bookName);
    	System.out.println("author : "+this.author);
    	System.out.println("genre : "+this.genre);
    	System.out.println("price : "+this.price);
    }
}

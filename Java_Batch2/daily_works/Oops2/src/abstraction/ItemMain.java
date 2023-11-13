package abstraction;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Item book=new Book(101,"abcd",10,"qwe");
			JournelPapper journal=new JournelPapper(102,"qed",5,"axhhxn","1998");
			Video video=new Video(103,"aidnd",7,30,"ddhndj","ahbdsh",1998);
			CD cd=new CD(104,"aiasg",9,60,"ancyd","anxusu");
			book.print();
			journal.print();
			video.print();
			cd.print();
			book.checkIn();
		}

	}


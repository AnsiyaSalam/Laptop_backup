
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book B1=new Book(123,"Aadujeevitham"," Paulo","hgfh",500.00);
        Book B2=new Book(124,"Mayakkannan","John","Cartoon",100.00);
        Book B3=new Book(125,"Tom & Jerry","Johny","Cartoon",250.00);
        
        System.out.println("Cheapest book : ");
        
        if(B1.price < B2.price && B1.price < B3.price)
        {
           B1.printBook();
        }
        if(B2.price < B1.price && B2.price < B3.price)
        {
        	B2.printBook();
        }
        else
        {
        	B3.printBook();
        }
	}

}

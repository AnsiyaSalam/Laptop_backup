package interfacepackage;

public class CanonPrinter implements Printer, Scanner{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Print in canon printer");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Scan in canon printer");
		
	}

}

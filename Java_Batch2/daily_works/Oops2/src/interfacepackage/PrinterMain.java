package interfacepackage;

public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanonPrinter cp=new CanonPrinter();
		HpPrinter hp=new HpPrinter();
		cp.print();
		cp.scan();
		hp.print();

	}

}

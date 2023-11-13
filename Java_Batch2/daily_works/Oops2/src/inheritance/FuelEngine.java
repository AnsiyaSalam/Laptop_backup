package inheritance;

public class FuelEngine extends Car{
	 int engineCc;
	public void refillFuel()
	{
		System.out.println("Fuel refilling");
	}
	public void carDetails()
	{
        super.carDetails();
		System.out.println("Car engine cc : "+engineCc);
	}


}

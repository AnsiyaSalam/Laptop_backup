package inheritance;

public class EV extends Car {
	 double batteryCapacity ;
	public void chargeBattery()
	{
		System.out.println("Battery Charging");
	}
	public void carDetails()
	{
        super.carDetails();
		System.out.println("Car Battery Charge : "+batteryCapacity);
	}

}


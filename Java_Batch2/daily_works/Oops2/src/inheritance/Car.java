package inheritance;

public class Car {
	protected String model;
	protected String regNo;
	protected String color;
	
	public void start()
	{
		System.out.println("car started");
	}
	public void brake()
	{
		System.out.println("car stop");
	}
	public void carDetails()
	{
		System.out.println("Car Name : "+model);
		System.out.println("Car regNo : "+regNo);
		System.out.println("Car Color : "+color);
	}

}

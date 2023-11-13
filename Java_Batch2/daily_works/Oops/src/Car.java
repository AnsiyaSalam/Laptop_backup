public class Car{
	int regNo;
	String modelName;
	String color;
	void start()
	{
		System.out.println("Start the car");
	}
	void printCarDetails()
	{
		System.out.println("Registration No: "+regNo);
		System.out.println("Model Name: "+modelName);
		System.out.println("Color: "+color);
	}
	void breakCar()
	{
		System.out.println("Stop the car");
	}
}

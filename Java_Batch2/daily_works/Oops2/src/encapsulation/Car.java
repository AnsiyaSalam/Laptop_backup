package encapsulation;

public class Car {
	private String model;
	private String color;
	private String regNo;
	
	
	
	public Car(String model, String color, String regNo) {
		super();
		this.model = model;
		this.color = color;
		this.regNo = regNo;
	}

	// getter method for model
	
	public String getModel()
	{
		return model;
	}
	
	// setter method for model
	
	public void setModel(String model)
	{
		this.model= model;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public void start()
	{
		System.out.println("Car started");
	}

	void showCarInfo()
	{
		System.out.println("car model : "+model);
		System.out.println("car color : "+color);
		System.out.println("car regNo : "+regNo);
	}
	
	
	
	
}


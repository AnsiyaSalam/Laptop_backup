package inheritance;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EV myCar =new EV();
		FuelEngine nextCar=new FuelEngine();
		myCar.start();
		myCar.color="Black";
		myCar.regNo="KL-1234";
		myCar.model="BMW";
		myCar.batteryCapacity=78.09;
		nextCar.start();
		nextCar.color="red";
		nextCar.regNo="KL-1234";
		nextCar.model="audi";
		nextCar.engineCc=250;
		nextCar.refillFuel();
		myCar.chargeBattery();
		myCar.carDetails();
		nextCar.carDetails();

	}

}

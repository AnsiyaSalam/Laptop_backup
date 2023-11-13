package problem_8;

public class UserMainCode8 {

	public static int calculateElectricityBill(int prevReading, int currReading, int perUnitCharge) {
		// TODO Auto-generated method stub
		
		int unitsConsumed = currReading - prevReading;
	    int billAmount = unitsConsumed * perUnitCharge;
	    return billAmount;
	}
}

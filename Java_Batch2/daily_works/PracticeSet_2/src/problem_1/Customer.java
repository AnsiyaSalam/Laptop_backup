package problem_1;

import java.util.Date;

public class Customer {
	
	private long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private double averageSpendAmount;
	private double totalAmount;
	private Date dateEnrolled;
	private double rating;
	
	public Customer(long id, String name, String mobileNumber, Date birthdate, double averageSpendAmount,
			double totalAmount, Date dateEnrolled, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public double getAverageSpendAmount() {
		return averageSpendAmount;
	}

	public void setAverageSpendAmount(double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + ", \nmobileNumber=" + mobileNumber + ", \nbirthdate=" + birthdate
				+ ", \naverageSpendAmount=" + averageSpendAmount + ", \ntotalAmount=" + totalAmount + ", \ndateEnrolled="
				+ dateEnrolled + ", \nrating=" + rating + "";
	}    
	
}

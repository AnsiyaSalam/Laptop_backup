package abstraction;

public abstract class MediaItem extends Item {
	private int runTime;
	public MediaItem(int idNo,String title,int noOfCopies,int runTime)
	{
		super(idNo,title,noOfCopies);
		this.runTime=runTime;
		
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public void print()
	{
		super.print();
		System.out.println("run time"+runTime);
	}
	
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("media checked in");
		
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("media check out");
		
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("media Added");
	}
		

}

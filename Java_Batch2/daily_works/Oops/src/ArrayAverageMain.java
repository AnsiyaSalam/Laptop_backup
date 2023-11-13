
public class ArrayAverageMain {
	public static void main(String []args) {
		ArrayAverage obj=new ArrayAverage();
		int []arr=new int[10000];
		arr=obj.getArrayValues();
		String str=obj.findAverage(arr);
		System.out.print(str);
	}

}

package problem_7;

import java.util.Arrays;

public class UserMainCode7 {

	public static int getBigDiff(int[] arr) {
		// TODO Auto-generated method stub
		
	    Arrays.sort(arr);
	    int a = arr[arr.length - 1] - arr[0];
	    int b = arr.length;
	    if (b == 1) {
	      a = arr[0];
	    }
	    return a;	
	}
}

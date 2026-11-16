package Practice.Arrays;

import java.util.Arrays;

public class DiffBetweenMaxAndMinNumInArr {
	public static void main(String[] args) {
		int[] arr= {34,56,78,23,22,43,87};
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int min=arr[0];
		System.out.println("The diff btwn max and min num in arr is "+(max-min));
	}

}

package Practice.Arrays;

public class FindMaximumNum {
	public static void main(String[] args) {
		int[] arr = {15,85,20,96,95,94};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the maximum num in arr is "+ max);
	}

}

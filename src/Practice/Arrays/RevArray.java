package Practice.Arrays;

public class RevArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		revArray(arr);
	}
	public static void revArray(int[] arr) {
		System.out.println("The rev arr is :- ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}

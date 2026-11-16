package Practice.Arrays;

import java.util.Arrays;

public class MoveZeroInBegginingOfArray {
	public static void main(String[] args) {
		int[] arr = {1,2,0,3,0,5,0,67,684,0,6464 };
		System.out.println("Original ");
		System.out.println(Arrays.toString(arr));
		int [] copy=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				copy[index]=arr[i];
				index++;
			}
		}
		for(int i=copy.length-1;i>=0;i--) {
			arr[i]=copy[i];
		}
		System.out.println("copy");
		System.out.println(Arrays.toString(copy));
		System.out.println("Original after change");
		System.out.println(Arrays.toString(arr));
		
	}


}

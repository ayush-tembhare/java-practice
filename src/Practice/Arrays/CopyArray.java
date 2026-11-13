package Practice.Arrays;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr1 = {15,85,26,98,65};
		int[] arr2= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("the copied arr is :- ");
		System.out.println(Arrays.toString(arr2));
	}

}

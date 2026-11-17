package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr ={1, 2, 3, 4, 5};
		int [] copyarr= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			copyarr[i]= arr[i];
		}
		System.out.println("Copied array:- ");
		System.out.println(Arrays.toString(copyarr));
	} 

}

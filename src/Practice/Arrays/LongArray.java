package Practice.Arrays;

import java.util.Arrays;

public class LongArray {
	public static void main(String[] args) {
		long[] arr = {-125,2,5,2,15};
		
		//using normal index 
		System.out.println("uisg normal index ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//using for loop 
		System.out.println("using for lo0p");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("using enhanced for loop");
		for(long x:arr) {
			System.out.println(x);
		}
			System.out.println("using to array ");
		System.out.println(Arrays.toString(arr));
			
	}


}

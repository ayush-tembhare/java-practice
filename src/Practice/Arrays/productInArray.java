package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class productInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter num at index "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int product=1;
		for(int x:arr) {
			product*=x;
		}
		System.out.println(product);
	}

}

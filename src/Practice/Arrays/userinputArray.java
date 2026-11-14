package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class userinputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter num at index "+i);
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
	}
}

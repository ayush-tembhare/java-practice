package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 9, 2, 3, 10, 6 };
		int[] arr2 = { 1, 7, 59, 62, 31, 10, 6 };
		System.out.println("Array 1 Before " + Arrays.toString(arr));
		System.out.println("Array 2 Before " + Arrays.toString(arr2));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After, using for loops " + Arrays.toString(arr));
		Arrays.sort(arr2);
		System.out.println("After, using builtin method " + Arrays.toString(arr2));

	}

}

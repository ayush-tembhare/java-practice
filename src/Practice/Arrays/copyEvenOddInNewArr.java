package Practice.Arrays;

import java.util.Arrays;

public class copyEvenOddInNewArr {
	public static void main(String[] args) {
		int[] arr= {1,2,4,56,5,6,7,8,9,10,11,12};
		printEven(arr);
		printOdd(arr);
		
		}
	public static void printEven(int[] arr) {
		int evencount=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				evencount++;
			}
		}
		int[] evencopy=new int[evencount];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				evencopy[index]=arr[i];
				index++;
			}
	}
		System.out.println(Arrays.toString(evencopy));
	}
	public static void printOdd(int[] arr) {
		System.out.println();
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
				oddCount++;
			}
		}
		int[] oddcopy=new int[oddCount];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
				oddcopy[index]=arr[i];
				index++;
			}
	}
		System.out.println(Arrays.toString(oddcopy));
	}

}

package Practice.Arrays;

public class PrintEvenOddFromArray {
	public static void main(String[] args) {
		int[] arr= {1,2,4,56,5,6,7,8,9,10,11,12};
		printEven(arr);
		printOdd(arr);
		
		}
	public static void printEven(int[] arr) {
		System.out.println("The Even nums from array are :- ");
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void printOdd(int[] arr) {
		System.out.println();
		System.out.println("The Odd nums from array are :- ");
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
}

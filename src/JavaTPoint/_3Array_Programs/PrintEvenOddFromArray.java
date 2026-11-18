package JavaTPoint._3Array_Programs;

public class PrintEvenOddFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 9, 2, 3, 10, 6 };
		System.out.println("The even nums in array are :- ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("The odd nums in array are :- ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}

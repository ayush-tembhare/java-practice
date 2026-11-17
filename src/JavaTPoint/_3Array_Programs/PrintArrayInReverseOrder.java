package JavaTPoint._3Array_Programs;

public class PrintArrayInReverseOrder {
	public static void main(String[] args) {
		int[] arr ={1, 2, 3, 4, 5};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}


}

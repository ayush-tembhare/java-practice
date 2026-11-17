package JavaTPoint._3Array_Programs;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] arr = {2,45,3,4,1,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Total sum is :- "+ sum);
	}

}

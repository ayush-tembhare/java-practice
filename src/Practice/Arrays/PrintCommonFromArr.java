package Practice.Arrays;

public class PrintCommonFromArr {
	public static void main(String[] args) {
		int[] arr1= {3,5,1,2};
		int[] arr2= {2,3,9,8};
		System.out.println("The Common nums in both array are :- ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	}

}

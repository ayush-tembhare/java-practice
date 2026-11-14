package Practice.Arrays;

public class findDuplicateInarray {
	public static void main(String[] args) {
		int[] arr= {2,4,6,6,8,9,10,4,46};
		findDuplicate(arr);
	}
	public static void findDuplicate(int[] arr) {
		System.out.println("The duplicate num in arrys are :- ");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;	
				}
			}
			
			
		}
		
	}
	

}

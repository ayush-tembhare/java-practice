package JavaTPoint._3Array_Programs;

public class FindSmallest {
	public static void main(String[] args) {
		
		int[] arr={1,7,5,9,2,3,10,6};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("The Smallest num in array is  "+ arr[0]);
	}

}

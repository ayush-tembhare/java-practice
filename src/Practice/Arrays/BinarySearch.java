package Practice.Arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,8,33,5,2,9,67};
		binarySearch(arr,9);
	}
	public static void binarySearch(int[] arr,int target) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		boolean isfound=false;
		int start=0;
		int end=arr.length-1;
		while(end>=start) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				System.out.println("target found at index "+ mid);
				isfound=true;
				break;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			
		}
		if(isfound==false) {
			System.out.println("target not present in arr");
		}
		
	}

}

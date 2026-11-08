package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReveseString_inArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter length of String array");
	        int size = sc.nextInt();

	        String [] arr = new String[size];
	        // Taking String array input
	        for(int i = 0; i < size; i++) {
	            System.out.println("Enter string at index " + i);
	            arr[i] = sc.next();
	        }
	        System.out.println("The orignal strings are "+Arrays.toString(arr));
	       System.out.println("The reversed strings are :- ");
	        
	        for(String x:arr) {
	        	int index=x.length()-1;
	        	for(int i=index ;i>=0;i--) {
	        		
	        	System.out.print(x.charAt(i));
	        	}
	        	System.out.println();
	        }
	        sc.close();
	}

}

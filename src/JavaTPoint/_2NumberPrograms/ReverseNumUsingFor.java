package JavaTPoint._2NumberPrograms;

import java.util.Scanner;

public class ReverseNumUsingFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num u want to reverse :- ");
		int num = sc.nextInt();
		int rev=0;
		sc.close();
if(num>=0) {
	for(;num>0;num=num/10){
		int last = num%10;
		 rev=(rev*10)+last;
		
	}
	System.out.println("The rev on the given num is :- "+rev);
}
		else {
			System.out.println("Please enter non Negative Integer");
		}
	}


}

package Practice.If_else;

import java.util.Scanner;
public class positive_negative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num val");
		int num=sc.nextInt();
		sc.close();
		if(num>0) {
			System.out.println("num is postivr");
		}
		else {
			System.out.println("num is negative");
		}
	}
}

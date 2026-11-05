package Practice.loops;

import java.util.Scanner;

public class Sum_of_digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the numn");
		int num=sc.nextInt();
		System.out.println("Sum of the digits of num "+num+" is "+ sumofDigit(num));
		sc.close();
		}
	
	public static int sumofDigit(int n) {
		int sumofDigit=0;
		while(n>0) {
			int last=n%10;
			 sumofDigit= last +sumofDigit;
			 n=n/10;
		}
		return sumofDigit;
		
	}

}

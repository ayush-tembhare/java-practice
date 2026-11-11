package JavaTPoint._1BasicPrograms;

import java.util.Scanner;

public class PrimeNum_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num you want to check ");
		int n=sc.nextInt();
		sc.close();
		
		boolean isPrime=true;
		if(n<=0||n==1) {
			System.out.println(n+" is not a prime num ");
		}
		else if(n==2){
			System.out.println(n+" is a prime num");
		}else {
		
			int i=2;
			do {
				
				if(n%i==0) {
					isPrime=false;
					System.out.println(n+" is not a prime num ");
					break;
				}
				i++;
			}while(i<=Math.sqrt(n));
			if(isPrime) {
				System.out.println(n+" is a prime num");
			}
		}
	}
}

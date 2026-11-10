package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class ArmstrongUsingFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num u want to check :- ");
		int num = sc.nextInt();
		sc.close();
		if(num<=0) {
			System.out.println("Please enter the value greater than zero");
		}else {
			int numcopy=num;
			int powerSum=0;
			int digit=0;
			
			for(;num>0;num=num/10){
				digit++;
			}
			num=numcopy;
			for(;num>0;num=num/10){
				int last=num%10;
				int sq= (int) Math.pow(last,digit);
				powerSum=powerSum+sq;
			}
			if(powerSum==numcopy) {
				System.out.println(numcopy+" is a Armstrong num");
			}
			else {
				System.out.println(numcopy+" is not a Armstrong num");
			}
		}	
	}
}

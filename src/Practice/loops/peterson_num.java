package Practice.loops;

import java.util.Scanner;

public class peterson_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter num u want to check ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int last= num%10;
			int fact=1;

			for(;last>0;last--) {
				fact=last*(last-1);
								
			}
			num=num/10;
			sum=sum+fact;
			System.out.println(fact);
		}
	}

}

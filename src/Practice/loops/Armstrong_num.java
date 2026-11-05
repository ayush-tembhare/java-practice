package Practice.loops;

import java.util.Scanner;

public class Armstrong_num {
		//1634
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter num u want to check ");
		int num=sc.nextInt();
		int numc=num;
		int sum=0;
		int digit =0;
		for(int i=0;i<numc;numc=numc/10) {
			digit++;
		}
		numc=num;
		System.out.println(digit);
		for(int i=0;i<numc;numc=numc/10) {
			int last=numc%10;
			int pow=(int) Math.pow(last, digit);
			sum=sum+pow;
		}
		if(num==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstring");
		}
		sc.close();		
	}
}

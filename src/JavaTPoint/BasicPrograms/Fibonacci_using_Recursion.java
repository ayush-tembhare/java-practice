package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class Fibonacci_using_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter val for num ");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		Fibanocci(num,n1,n2);
		sc.close();

		
	}
	public static void Fibanocci(int num,int n1,int n2) {
		if(num<=2) {
			return;
		}
		int n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		Fibanocci(num-1,n1,n2);
	}

}

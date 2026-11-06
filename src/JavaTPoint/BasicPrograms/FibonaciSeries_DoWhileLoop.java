package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class FibonaciSeries_DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num till  Fibonacci series you want ");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		if(num<=0) {
			System.out.println("please enter minimum value 1");
		}
			
		else if(num==1) {
				System.out.print(n1+" ");
			}
		else if(num==2) {
			System.out.print(n1+" ");
			System.out.print(n2+" ");
		}
		else if(num>2&&num<48) {
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			int i=2;
			do{
				int n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;	
				i++;
			}while(i<num);
		}
		else if(num>=48) {
			System.out.println("Cannot generate more than 47 terms using int. ");
		}			
		sc.close();
	}
	

}

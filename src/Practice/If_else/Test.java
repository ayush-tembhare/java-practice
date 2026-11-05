package Practice.If_else;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter the num");
			int num =sc.nextInt();
			check(num);

			sc.close();
			}
		public static void check(int num) {
			if((num%2)==0) {
				System.out.println(num+" is a even num"+" and the square of "+num+" is "+num*num);
			}else {
				System.out.println(num+"is a odd num"+"and the cube of "+num+" is "+num*num*num);
			}
		}
}

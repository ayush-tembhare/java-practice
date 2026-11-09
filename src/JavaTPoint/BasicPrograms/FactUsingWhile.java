package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class FactUsingWhile {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number u want fact of");
		 int num = sc.nextInt();
		 int fact=1;
		 sc.close();
		 if(num>=0) {
			 while(num>=1) {
				 fact=fact*num;
				 num--;
			 }
			 System.out.println(fact);
		 }else {
			 System.out.println("please enter non negative num");
		 }
		 
		 
	}


}

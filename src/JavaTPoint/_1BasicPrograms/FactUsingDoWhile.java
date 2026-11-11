package JavaTPoint._1BasicPrograms;

import java.util.Scanner;

public class FactUsingDoWhile {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number u want fact of");
		 int num = sc.nextInt();
		 int fact=1;
		 sc.close();
		 if(num==0) {
			 System.out.println(fact);
		 }
		 else if(num>0) {
			do{
				 fact=fact*num;
				 num--;
			 } while(num>=1) ;
			 System.out.println(fact);
		 }else {
			 System.out.println("please enter non negative num");
		 }
		 
		 
	}


}

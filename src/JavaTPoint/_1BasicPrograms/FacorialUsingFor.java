package JavaTPoint._1BasicPrograms;

import java.util.Scanner;

public class FacorialUsingFor {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number u want fact of");
		 int num = sc.nextInt();
		 int fact=1;
		 sc.close();
		 if(num>=0) {
			 for(int i=num;i>=1;i--) {
				 fact=fact*i;
			 }
			 System.out.println(fact);
		 }else {
			 System.out.println("please enter non negative num");
		 }
		 
		 
	}

}

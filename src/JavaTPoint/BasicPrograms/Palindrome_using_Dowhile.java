package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class Palindrome_using_Dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num you want to check");
		int num=sc.nextInt();
		int numcopy=num;
		int rev=0;
		sc.close();
	  do{
		  int last =num%10;
		   rev=(rev*10) + last;
           num=num/10;
	  }while(num>0);
	  if(rev==numcopy) {
		  System.out.println(numcopy+" is a palidrome num");
	  }else {
		  System.out.println(numcopy+" is not a palindrome");
	  }
	}


}

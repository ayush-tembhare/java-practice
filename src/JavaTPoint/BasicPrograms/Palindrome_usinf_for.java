package JavaTPoint.BasicPrograms;

import java.util.Scanner;

public class Palindrome_usinf_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num you want to check");
		int num=sc.nextInt();
		int numcopy=num;
		int rev=0;
		sc.close();
		for(;num>0; num=num/10){
		  int last =num%10;
		   rev=(rev*10) + last;
          
	  }
	  if(rev==numcopy) {
		  System.out.println(numcopy+" is a palidrome num");
	  }else {
		  System.out.println(numcopy+" is not a palindrome");
	  }
	}

}

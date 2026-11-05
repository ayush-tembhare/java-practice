package Practice.loops;

import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter num you want to check");
    	int num=sc.nextInt();
		int reverse=reverse(num);
		if(reverse==num) {
			System.out.println(num+" is a palindrome ");
		}else {
			System.out.println(num +" not a palindroem");
		}
		sc.close();
	}
    public static int reverse(int n) {
    	int reverse=0;
    	while(n>0) {
    		int last=n%10;
    		reverse=last+(reverse*10);
    		n=n/10;
    	}
    	return reverse;
    }
}

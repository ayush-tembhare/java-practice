package Practice.If_else;
import java.util.Scanner;
public class zero_or_not {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter num");
		  	int num=sc.nextInt();
		  	sc.close();
		  	if(num==0) {
		  		System.out.println("num is 0");
		  	}
		  	else {
		  		System.out.println("not zero");
		  	}
	}
}

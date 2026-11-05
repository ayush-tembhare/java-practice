package Practice.loops;
import java.util.Scanner;

public class Product_of_Digit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the numn");
		int num=sc.nextInt();
		System.out.println("product of the digits of num "+num+" is "+ productofDigit(num));
		sc.close();
		}
	
	public static int productofDigit(int n) {
		int product=1;
		while(n>0) {
			int last=n%10;
			product= last *product;
			 n=n/10;
		}
		return product;
		
	}
}

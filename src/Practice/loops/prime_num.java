package Practice.loops;
import java.util.Scanner;
public class prime_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		//isprime(num);
		//primeSeries(num);
		nth_prime(num);
		
	}
	
	public static void factors(int num) {
		System.out.println("factors of "+num +"are as follows :- ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void isprime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is prime num ");
		}
		else {
			System.out.println(num+" is not prime num ");
		}
	}
	
	public static void primeSeries(int num) {
		for(int i=2;i<=num;i++) {
			int j;
			for( j=2;j<i;j++) {
				if (i % j == 0) {
                   break;
                }		
			}
			if (j==i){
				System.out.println(i);
			}
		}
			
		}
	
	public static void nth_prime(int num) {
		int nthcount=0;
		for(int i=2;i<=num;i++) {
			int j;
			for( j=2;j<i;j++) {
				if (i % j == 0) {
                   continue;
                }		
			}
			if (j==i){
				nthcount++;
			}
			if(nthcount==num) {
				int nthPrime=i;
				System.out.println("the "+num+" th prime num is "+ nthPrime);
				break;
			}
			
				
		}
			
	}
	
}

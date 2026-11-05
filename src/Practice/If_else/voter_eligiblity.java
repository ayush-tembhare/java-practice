package Practice.If_else;
import java.util.Scanner;
public class voter_eligiblity {
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter ur age");
		int age=Sc.nextInt();
		Sc.close();
		
		if(age>18) {
			System.out.println("u r eligible for voting ");
		}
		else {
			System.out.println(" you are not eligible for voting");
		}
		
	}
	

}

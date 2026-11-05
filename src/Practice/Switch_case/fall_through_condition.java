package Practice.Switch_case;
import java.util.Scanner;

public class fall_through_condition {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any char");
		char ch=sc.next().charAt(0);
		char c=Character.toLowerCase(ch);
		sc.close();
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("Consonent");
			break;
			
		}
	}
}

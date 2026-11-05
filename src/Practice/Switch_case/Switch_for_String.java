package Practice.Switch_case;
import java.util.Scanner;
public class Switch_for_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter operation you want to perform:--");
		System.out.println("Enetr 'Login' for login");
		System.out.println("Enetr 'Registration' for Registration");
		System.out.println("Enetr 'Logout' for logout");
		String ops=sc.next();
		
		String id;
		String pass;
		switch(ops) {
		
		case "Login":
			System.out.println("ENter ur id ");
			 id=sc.nextLine();
			System.out.println("Enter ur pass");
			 pass=sc.nextLine();
			if(id=="123" && pass=="123") {
				System.out.println("Login successfull");
			}else {
				System.out.println("Invalid crediatinels ");
			}
			break;
		case "Registration":
			System.out.println("enter your id ");
			 id=sc.nextLine();
			System.out.println("Enter ur pass");
			 pass=sc.nextLine();
			 
			 System.out.println("your registration is successfull and ur user id is "+id+" and ur pass is "+pass);
			
			break;
		case "Logout":
			System.out.println("logout successfuly");
			break;
		default:
			System.err.println("invalid input");
			break;
		}
		sc.close();
	}

}

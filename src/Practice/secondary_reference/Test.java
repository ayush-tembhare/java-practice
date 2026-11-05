package Practice.secondary_reference;
import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//for fb
			System.out.println("Enter ur fb username");
			String fbusername=sc.next();
			System.out.println("Enter ur fb pass");
			String fbpass=sc.next();
			Facebook f = new Facebook(fbusername,fbpass);
			
			//for insta
			System.out.println("Enter ur insta username");
			String instausername=sc.next();
			System.out.println("Enter ur insta pass");
			String instapass=sc.next();
			Instagram i = new Instagram(instausername,instapass);
			sc.close();
			
			Social_media social_media= new Social_media(f,i);
			//using to string 
			System.out.println(social_media);
			//using getters 
			System.out.println("Facebook Username: " + social_media.getFacecook().getFbusername());
			System.out.println("Facebook Password: " + social_media.getFacecook().getFbpassword());

			System.out.println("Instagram Username: " + social_media.getInstagram().getInstaUsername());
			System.out.println("Instagram Password: " + social_media.getInstagram().getInstaPassword());
			
			
	 }
}

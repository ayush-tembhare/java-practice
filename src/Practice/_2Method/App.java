package Practice._2Method;

public class App {
	public static int getId() {
		int id=1001;
		return id;
	}
	public int getRollNo() {
		int rollNo=101;
		return rollNo;
	}
	public int getPinCode() {
		int pinCode=389438;
		return pinCode;
	}
	public static void main(String[] args) {
		int x=getId();
		System.out.println("Id is: "+x);
		
		App a=new App();
		System.out.println("Roll no is: "+a.getRollNo());
		
		int y= a.getPinCode();
		System.out.println(y);
		
}

}

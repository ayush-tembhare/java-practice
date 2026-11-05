package Practice._3constructor;



public class AssignCOnstructor {
	int id;
	String name;
	char sec;
	double fees;
	public AssignCOnstructor(int id, String name, char sec, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.sec = sec;
		this.fees = fees;
	}
	public static void main(String[] args) {
		AssignCOnstructor a=new AssignCOnstructor(27, "Ajay", 'A', 8273.39);
		System.out.println(a.id+" "+" "+a.name+" "+a.sec+" "+a.fees);
	}
	

	
	
	
}

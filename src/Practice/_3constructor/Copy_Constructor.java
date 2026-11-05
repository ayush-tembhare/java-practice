package Practice._3constructor;

public class Copy_Constructor {
	int id;
	String name;
	char sec;
	double fees;
	public Copy_Constructor(int id, String name, char sec, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.sec = sec;
		this.fees = fees;
	}
	
	//copy construct the we give parameter as the class and give parameter as object while giving data
	public Copy_Constructor(Copy_Constructor c) {
		super();
		this.id = c.id;
		this.name = c.name;
		this.sec = c.sec;
		this.fees = c.fees;
	}
	public static void main(String[] args) {
		Copy_Constructor a=new Copy_Constructor(2007, "Ajay", 'A', 8273.39);
		Copy_Constructor b=new Copy_Constructor(a);
		
		
		System.out.println(a.id+" "+" "+a.name+" "+a.sec+" "+a.fees);
		System.out.println(b.id+" "+" "+b.name+" "+b.sec+" "+b.fees);
	}
	
	

}

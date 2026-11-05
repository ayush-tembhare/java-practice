package Practice._2Method;

public class C1 {
	
	String name="Aniket";

	
	public void m1(){
		C2 a=new C2();
		  String l=a.m2(name);
		  System.out.println(l);
		
	}
	
	public static void main(String[] args) {
		C1 k=new C1();
		k.m1();
	}
}

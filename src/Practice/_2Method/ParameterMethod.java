package Practice._2Method;

public class ParameterMethod {
	
	//parameter method without return type that is --void
	public void m1(int a,int b) {
		System.out.println(a+b);
	}
	public static void m2(String a,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ParameterMethod p= new ParameterMethod();
		p.m1(47, 46);
		
		m2("Hello", "41");
	
		
	}

}

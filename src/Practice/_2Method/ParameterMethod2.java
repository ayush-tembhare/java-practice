package Practice._2Method;

public class ParameterMethod2 {
	
	// parameter argument with return type ---that is primative and non primative
	
	
	public int m1(int m,int n){
		return m/n;
		
	}
	
	public static int m2(int m,int n){
		return m*n;
		
	}
	
	public static void main(String[] args) {
		ParameterMethod2 p=new ParameterMethod2();
		System.out.println(p.m1(464474848, 5));
		System.out.println(m2(488, 10));
	}

}

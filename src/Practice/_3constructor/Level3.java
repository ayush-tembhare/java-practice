package Practice._3constructor;

public class Level3 {
	public Level3() {
		this(34,55);
		System.out.println("This is first non paramererise constructor");
		
		
	}
	
	
	
	public Level3(int a,int b) {
		this("Amey");
		System.out.println("this is secon constructor : "+(a+b));
	}
	
	public Level3(String name) {
		this(44,84.58f);
		System.out.println("The name is : "+name);
		
	}
	
	public Level3(int a,float b) {
		System.out.println("The multiplication is"+(a*b));
		
	}
	
	public static void main(String[] args) {
		new Level3();
		//new Level2(34,55);
	}

}

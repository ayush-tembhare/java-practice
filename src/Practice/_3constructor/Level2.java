package Practice._3constructor;

public class Level2 {
	
	public Level2() {
		//this(34,55);
		System.out.println("This is first non paramererise constructor");
		
		
	}
	
	public Level2(int a,int b) {
		System.out.println("this is secon constructor : "+(a+b));
	}
	
	public static void main(String[] args) {
		new Level2();
		new Level2(34,55);
	}

}

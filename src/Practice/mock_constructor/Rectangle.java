package Practice.mock_constructor;

public class Rectangle {
	double length;
	double width;
	
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5.5,4.0);
		double area=r1.length*r1.width;
		System.out.println("The area of rectangle is "+area);
		
	}

}

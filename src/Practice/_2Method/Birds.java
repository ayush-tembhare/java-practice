package Practice._2Method;

public class Birds {
	 String name;
	 String size;
	 String color;
	 
	 public void getBirdInfo(){
		 System.out.println(name+" "+size+" "+" "+color);
	 }
	 
	 public static void getBirdBehavior(){
		 System.out.println("All birds can Fly");
	 }
	 public static void main(String[] args) {
		Birds b1=new Birds();
		b1.name="Crow";
		b1.size="Small";
		b1.color="Black";
		
		
		Birds b2=new Birds();
		b2.name="Ostrig";
		b2.size="Big";
		b2.color="White";
		
		b1.getBirdInfo();
		b1.getBirdBehavior();
		

		b2.getBirdInfo();
		b2.getBirdBehavior();
		
		
		
	}

}

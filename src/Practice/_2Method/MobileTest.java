package Practice._2Method;


public class MobileTest {
	public static Mobile getMobileData() {
		Mobile m=new Mobile();
		m.name="Vivo Y12";
		m.serialNo=8374874;
		m.brand="Vivo";
		m.price=39874.48;
		return m;
	}
	public static void main(String[] args) {
		Mobile s = getMobileData();
		System.out.println(s.name+"  "+"Serial no. "+s.serialNo+" Brand "+s.brand+" price "+s.price);
	}

}

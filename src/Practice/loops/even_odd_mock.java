package Practice.loops;

public class even_odd_mock {
	public static void main(String[] args) {
		test2();
		test1();
		
	}
	public static void test1() {
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("the num is "+i +" is even");
			}else {
				System.out.println("the num is "+i +" is odd");
			}
		}
		
	}
	public static void test2() {
		System.out.println("the odd number are :- ");
		for(int i=1;i<=100;i+=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("the even number are :- ");
		for(int i=2;i<=100;i+=2) {
			System.out.print(i+" ");
		}
		
	}
}

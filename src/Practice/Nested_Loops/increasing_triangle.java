package Practice.Nested_Loops;

public class increasing_triangle {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
					
	int cnum=65;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print((char)cnum+" ");
				cnum++;
			}
			System.out.println();
	}
		int cnum3=65;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)cnum3+" ");
			}
			cnum3++;
			System.out.println();
		}
	for(int i=1;i<5;i++) {
		int cnum2=65;
		for(int j=1;j<=i;j++) {
			System.out.print((char)cnum2+" ");
			cnum2++;
		}
		
		System.out.println();
	}
		
		
	}
}

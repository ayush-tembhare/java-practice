package Practice.Nested_Loops;

public class do_while_Nesting {
	public static void main(String[] args) {
		int i=1;
		int num=1;
		int cnum=65;
		
//		do {
//			int j=1;
//			do {
//				System.out.print(j+" ");
//				j++;
//			}while(j<4);
//			System.out.println();
//			i++;
//		}while(i<4);
		
		
//		
//		do {
//			int j=1;
//			do {
//				System.out.print(num+" ");
//				j++;
//				num++;
//			}while(j<4);
//			System.out.println();
//			i++;
//		}while(i<4);
		
		do {
			int j=1;
			do {
				System.out.print((char)cnum+" ");
				j++;
				cnum++;
			}while(j<4);
			System.out.println();
			i++;
		}while(i<4);
	}

}

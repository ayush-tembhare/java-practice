package Practice.Nested_Loops;

public class simple_matrix {
	public static void main(String[] args) {
		int num=65; //97 for lower case 
		for(int i=1;i<4;i++) {
			
			for(int j=1;j<4;j++) {
				System.out.print((char)num+" ");
				num++;
			}
			System.out.println();
		}
	}

}

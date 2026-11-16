package Practice.Arrays._2D_Arrays;

import java.util.Scanner;

public class UserInput2D_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter number of rows ");
		int row=sc.nextInt();
		System.out.println("ENter number of cols ");
		int col=sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter num at "+i+" "+ j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing 2 d arr");
		for(int[] x:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}

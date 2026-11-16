package Practice.Arrays._2D_Arrays;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of rows u want in ur jagged array");
		int rows=sc.nextInt();
		
		int arr [][]= new int[rows][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the col u want in " + i + "th row ");
			int col=sc.nextInt();
			arr[i]=new int[col];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter num at "+i+" "+ j);
				arr[i][j]=sc.nextInt();
			}		
		}
		System.out.println();
		System.out.println("Printing jagged  array ");
		for(int[] x:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}

package Practice.Arrays._2D_Arrays;

public class TwoD_Array {
	public static void main(String[] args) {
		int [][] arr= {{123,258,2626},
				{584,865,963},
				{423,257,123}
				};
		System.out.println("Printing 2d array elemnt using index");
		System.out.println(arr[0][1]);//arr[row][column]
		System.out.println();
		
		System.out.println("Print 2 d array using nested for loop");
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Print 2d array using nested enhanced for loop");
		for(int[] x:arr) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	

}

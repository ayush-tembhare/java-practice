package Practice.Arrays._2D_Arrays;

public class MatrixSubstraction {
	  public static void main(String[] args) {

	        int[][] arr1 = {
	        		{53, 6},
		            {71, 86}
	           
	        };

	        int[][] arr2 = {
	        		 {19, 20},
	 	            {36, 47}
	            
	        };

	        // Check matrix dimensions
	        if (arr1.length != arr2.length) {
	            System.out.println("Matrix dimensions must be equal.");
	            return;
	        }

	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i].length != arr2[i].length) {
	                System.out.println("Matrix dimensions must be equal.");
	                return;
	            }
	        }

	        // Create result matrix
	        int[][] result = new int[arr1.length][];

	        for (int i = 0; i < arr1.length; i++) {
	            result[i] = new int[arr1[i].length];

	            for (int j = 0; j < arr1[i].length; j++) {
	                result[i][j] = arr1[i][j] - arr2[i][j];
	            }
	        }

	       System.out.println("The Matrix Substraction is :- ");
	        for (int[] x : result) {
	            for (int y : x) {
	                System.out.print(y + " ");
	            }
	            System.out.println();
	        }
	    }
}

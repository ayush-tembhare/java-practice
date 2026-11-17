package Practice.Arrays._2D_Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] arr1 = {
        		{53, 6},
	            {71, 86}
           
        };

        int[][] arr2 = {
        		 {19, 20},
 	            {36, 47}
            
        };
        
        for(int i=0;i<arr1.length;i++) {
        	for(int j=0;j<arr1[i].length;j++) {
        		 arr1[i][j]*arr2[i][j] +  arr1[i][j+1]*arr2[i+1][j];
        	}
        }
		
	}

}

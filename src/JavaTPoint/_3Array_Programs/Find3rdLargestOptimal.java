package JavaTPoint._3Array_Programs;

public class Find3rdLargestOptimal {
	 public static void main(String[] args) {
	        int[] arr = {10, 30, 30, 20, 5, 30};

	        if (arr.length < 3) {
	            System.out.println("Array must have at least 3 elements.");
	            return;
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;
	        int third = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            int current = arr[i];

	            // Skip duplicates of already tracked top values
	            if (current == first || current == second || current == third) {
	                continue;
	            }

	            if (current > first) {
	                // Cascade all values down by one rank
	                third = second;
	                second = first;
	                first = current;
	            } else if (current > second) {
	                // Cascade second down to third
	                third = second;
	                second = current;
	            } else if (current > third) {
	                third = current;
	            }
	        }

	        if (third == Integer.MIN_VALUE) {
	            System.out.println("No 3rd distinct largest element exists.");
	        } else {
	            System.out.println("3rd Largest Element: " + third);
	        }
	    }

}

package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2; // Number of right rotations

        // Edge case & optimization: avoid full-cycle redundant rotations
        if (arr.length > 0) {
            k = k % arr.length;

            // Outer loop: repeats the single-rotation process 'k' times
            for (int r = 0; r < k; r++) {
                int temp = arr[arr.length - 1];

                // Inner loop: shifts all elements one step to the right
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }

                arr[0] = temp;
            }
        }

        System.out.println("Array after " + k + " right rotations: " + Arrays.toString(arr));
    }
}
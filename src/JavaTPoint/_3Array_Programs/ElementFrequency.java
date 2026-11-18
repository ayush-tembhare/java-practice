package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class ElementFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5,8, 3, 2, 2, 2, 5, 1};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Element | Frequency");
        System.out.println("-------------------");

        for (int i = 0; i < arr.length; i++) {
            // Skip if this element was already counted in a previous iteration
            if (visited[i]) {
                continue;
            }

            int count = 1; // Count the current element itself

            // Check remaining elements to the right for duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark future occurrences so they are not recounted
                }
            }

            System.out.println("   " + arr[i] + "    |     " + count);
        }
    }
}
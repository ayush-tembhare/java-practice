package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class PrintDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3, 2};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Duplicate Elements: ");

        for (int i = 0; i < arr.length - 1; i++) {
            // Skip if this element was already counted/checked in an earlier pass
            if (visited[i]) {
                continue;
            }

            boolean isDuplicate = false;

            // Scan remaining elements to the right for matches
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark future occurrences so they won't re-trigger
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
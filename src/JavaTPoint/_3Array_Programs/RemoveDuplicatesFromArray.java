package JavaTPoint._3Array_Programs;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Sort first if the input array is not already sorted:
        // Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        // Compare each element with its immediate next neighbor
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Store the last element (it has no next neighbor to compare against)
        temp[j] = arr[arr.length - 1];
        j++;

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("After Removing Duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenNumInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Taking array input
        for(int i = 0; i < size; i++) {
            System.out.println("Enter number at index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("The entered array is " + Arrays.toString(arr));
        System.out.println("The even numbers from array are:");

        for(int x : arr) {
            if(x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}
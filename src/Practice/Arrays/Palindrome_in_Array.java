package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_in_Array {

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

        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Palindrome numbers from array are as follows:");

        for(int x : arr) {

            int num = x;
            int rev = 0;

            if(x < 0) {
                continue;
            }
           
            for(int i=0;x>i;x=x/10) {

                int last = x % 10;
                rev = rev * 10 + last;
            }

            if(num == rev) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
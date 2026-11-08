package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimenumOfArray {

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

        // Finding prime numbers
        for(int x : arr) {

            boolean isprime = true;

            if(x <= 1) {
                continue;
            }

            int sqrt = (int)Math.sqrt(x);

            for(int i = 2; i <= sqrt; i++) {

                if(x % i == 0) {
                    isprime = false;
                    break;
                }
            }

            if(isprime) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}
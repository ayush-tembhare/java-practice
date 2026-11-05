package Practice.String_and_loops;

import java.util.Scanner;

public class Password_validation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tryCount = 0;

        while (tryCount < 3) {

            System.out.println("Enter your password:");
            String pass = sc.nextLine();

            int digitCount = 0;
            int UpperCount = 0;
            int LowerCount = 0;
            int spaceCount = 0;
            int specialCount = 0;

            if (pass.length() < 10) {
                System.out.println("Password length must be at least 10 characters.");
                tryCount++;
                continue;
            }

            for (int i = 0; i < pass.length(); i++) {

                char ch = pass.charAt(i);

                if (Character.isDigit(ch)) {
                    digitCount++;
                }

                if (Character.isUpperCase(ch)) {
                    UpperCount++;
                }

                if (Character.isLowerCase(ch)) {
                    LowerCount++;
                }

                if (ch == ' ') {
                    spaceCount++;
                }

                if (!Character.isDigit(ch) && !Character.isLetter(ch) && ch != ' ') {
                    specialCount++;
                }
            }

            if (digitCount >= 1 && UpperCount >= 1 && LowerCount >= 1
                    && spaceCount == 0 && specialCount >= 1) {

                System.out.println("Strong password!");
                break;

            } else {

                tryCount++;

                if (tryCount < 3) {
                    System.out.println("Weak password! Try again.");
                } else {
                    System.out.println("3 attempts exceeded. Try again after 24 hours.");
                }
            }
        }

        sc.close();
    }
}
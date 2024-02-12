/*4. Write a program for determining whether a number is a Perfect number or not. (e.g. 28 is a
Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)*/



package assignment1;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfect = isPerfectNumber(number);

        if (isPerfect) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 1; // Start with 1 because 1 is a divisor for all numbers

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }
}


/* OUTPUT
 * Enter a number: 28
28 is a Perfect Number.
 */


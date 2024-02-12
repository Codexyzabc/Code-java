/*5. Write a program to find the prime factors of the given number . (e.g. Input : 315 Output: 3 3
5 7)*/



package assignment1;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Prime factors of " + number + " are:");
        findPrimeFactors(number);

        scanner.close();
    }

    public static void findPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}

/* OUTPUT 
 * 
 * Enter a positive integer: 315
Prime factors of 315 are:
3 3 5 7*/

/*3. The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos. Write a
program to print the first n (to be taken as input) Fibonacci nos.*/



package assignment1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        printFibonacciSeries(n);

        scanner.close();
    }

    public static void printFibonacciSeries(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series (first " + n + " numbers):");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}




/*OUTPUT
 * 
 * Enter the number of Fibonacci numbers to print: 10
 
Fibonacci Series (first 10 numbers):
0 1 1 2 3 5 8 13 21 34 */
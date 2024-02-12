/* 7. Write a program to find all Armstrong numbers in the range 1 to M, where M is taken
as input.*/



package assignment1;

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit (M): ");
        int m = scanner.nextInt();

        if (m <= 0) {
            System.out.println("Negative numbers and zero are not valid limits.");
        } else {
            System.out.println("Armstrong numbers in the range 1 to " + m + " are: ");
            for (int i = 1; i <= m; i++) {
                if (isArmstrongNumber(i)) {
                    System.out.print(i + "  ");
                }
            }
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int n = number;
        int numDigits = countDigits(number);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}


/* OUTPUT 
Enter the limit (M): 200
Armstrong numbers in the range 1 to 200 are: 
1  2  3  4  5  6  7  8  9  153 */
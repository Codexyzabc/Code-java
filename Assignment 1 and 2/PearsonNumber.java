/*6. Write a program for determining whether a number is a Pearson number or not.
(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)*/



package assignment1;

import java.util.Scanner;

public class PearsonNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers are not Pearson Numbers.");
        } else {
            int n = num;
            int f = 1, r, s = 0;

            while (n > 0) {
                r = n % 10;
                n /= 10;
                for (int i = 1; i <= r; i++) {
                    f *= i;
                }
                s += f;
                f = 1;
            }

            if (s == num) {
                System.out.println("Pearson Number");
            } else {
                System.out.println("Not a Pearson Number");
            }
        }
    }
}

/* OUTPUT 
 * Enter a number 
145
Pearson Number
*/

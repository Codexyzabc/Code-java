/*1. Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to
print the number of students who have obtain marks:
(a) in the range 81 to 100 (b) in the range 61 to 80
(c) in the range 41 to 60 (d) in the range 0 to 40*/




package assignment2;

import java.util.Scanner;

public class MarksRangeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Count students in each range
        int range1Count = 0; // 81-100
        int range2Count = 0; // 61-80
        int range3Count = 0; // 41-60
        int range4Count = 0; // 0-40

        for (int mark : marks) {
            if (mark >= 81 && mark <= 100) {
                range1Count++;
            } else if (mark >= 61 && mark <= 80) {
                range2Count++;
            } else if (mark >= 41 && mark <= 60) {
                range3Count++;
            } else if (mark >= 0 && mark <= 40) {
                range4Count++;
            }
        }

        // Print the counts
        System.out.println("Number of students in the range 81-100: " + range1Count);
        System.out.println("Number of students in the range 61-80: " + range2Count);
        System.out.println("Number of students in the range 41-60: " + range3Count);
        System.out.println("Number of students in the range 0-40: " + range4Count);

        scanner.close();
    }
}
/*OUTPUT
 * 
 * Enter the number of students: 5
Enter marks for student 1: 89
Enter marks for student 2: 87
Enter marks for student 3: 63
Enter marks for student 4: 65
Enter marks for student 5: 55
Number of students in the range 81-100: 2
Number of students in the range 61-80: 2
Number of students in the range 41-60: 1
Number of students in the range 0-40: 0
*/

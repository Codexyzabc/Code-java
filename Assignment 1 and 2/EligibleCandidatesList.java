/*2. Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50
(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200

(Or)
Total in Maths & Physics>=150

Given the marks in the 3 subjects of n (user input) students, write a program to process
the applications to list the eligible candidates.*/




package assignment2;

import java.util.Scanner;

public class EligibleCandidatesList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] mathMarks = new int[n];
        int[] physicsMarks = new int[n];
        int[] chemistryMarks = new int[n];

        // Input student information and marks for each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter marks in Mathematics for " + names[i] + ": ");
            mathMarks[i] = scanner.nextInt();
            System.out.print("Enter marks in Physics for " + names[i] + ": ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Enter marks in Chemistry for " + names[i] + ": ");
            chemistryMarks[i] = scanner.nextInt();
        }

        System.out.println("Eligible Candidates:");

        for (int i = 0; i < n; i++) {
            if (isEligible(mathMarks[i], physicsMarks[i], chemistryMarks[i])) {
                System.out.println(names[i]);
            }
        }

        scanner.close();
    }

    public static boolean isEligible(int math, int physics, int chemistry) {
        //return (math >= 60 && physics >= 50 && chemistry >= 40) || (math + physics >= 150) || (math + chemistry >= 150) || (physics + chemistry >= 150);
        return ((math>=60 && physics >=50 && chemistry >=40 )&&(math+physics+chemistry>=200)) || (math + physics >=150);
    }
}


/*OUTPUT

Enter the number of students: 2
Enter the name of student 1: souvik
Enter marks in Mathematics for souvik: 88
Enter marks in Physics for souvik: 78
Enter marks in Chemistry for souvik: 69
Enter the name of student 2: sohan
Enter marks in Mathematics for sohan: 88
Enter marks in Physics for sohan: 78
Enter marks in Chemistry for sohan: 69
Eligible Candidates:
souvik
sohan
*/
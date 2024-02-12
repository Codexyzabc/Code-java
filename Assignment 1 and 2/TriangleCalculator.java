/*1. Write a program that reads three coordinate and calculate the side of triangle. Check whether
these numbers can be considered as the three sides of a triangle. If so, find the type
(isosceles, equilateral or right-angled) and area of the triangle.
*/


package assignment1;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of three points
        System.out.println("Enter the coordinates of Point A (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of Point B (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter the coordinates of Point C (x3 y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Calculate the side lengths of the triangle
        double sideAB = calculateDistance(x1, y1, x2, y2);
        double sideBC = calculateDistance(x2, y2, x3, y3);
        double sideCA = calculateDistance(x3, y3, x1, y1);
        
        
        System.out.println("Side AB: " + sideAB);
        System.out.println("Side BC: " + sideBC);
        System.out.println("Side CA: " + sideCA);

        // Check if these sides can form a valid triangle
        if (isValidTriangle(sideAB, sideBC, sideCA)) {
            // Determine the type of triangle
            if (isEquilateral(sideAB, sideBC, sideCA)) {
                System.out.println("Equilateral Triangle");
            } else if (isIsosceles(sideAB, sideBC, sideCA)) {
                System.out.println("Isosceles Triangle");
            } else if (isRightAngled(sideAB, sideBC, sideCA)) {
                System.out.println("Right-Angled Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

            // Calculate and print the area of the triangle
            double area = calculateArea(sideAB, sideBC, sideCA);
            System.out.println("Area of the triangle: " + area);
        } else {
            System.out.println("These side lengths cannot form a valid triangle.");
        }

        scanner.close();
    }

    // Calculate the distance between two points using the distance formula
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
    }

    // Check if the sides can form a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }

    // Check if the triangle is equilateral
    public static boolean isEquilateral(double side1, double side2, double side3) {
        return (side1 == side2) && (side2 == side3);
    }

    // Check if the triangle is isosceles
    public static boolean isIsosceles(double side1, double side2, double side3) {
        return (side1 == side2) || (side2 == side3) || (side3 == side1);
    }

    // Check if the triangle is right-angled
    public static boolean isRightAngled(double side1, double side2, double side3) {
        double[] sides = { side1, side2, side3 };
        java.util.Arrays.sort(sides);

        return (Math.pow(sides[2], 2) == (Math.pow(sides[0], 2) + Math.pow(sides[1], 2)));
    }

    // Calculate the area of the triangle using Heron's formula
    public static double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}



/*OUTPUT
 * Enter the coordinates of Point A (x1 y1):
0
6
Enter the coordinates of Point B (x2 y2):
0
0
Enter the coordinates of Point C (x3 y3):
5
0
Side AB: 6.0
Side BC: 5.0
Side CA: 7.810249675906654
Scalene Triangle
Area of the triangle: 15.0*/




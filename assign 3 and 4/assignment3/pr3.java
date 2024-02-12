/*3. Write a program to print the area of a rectangle by creating a class named 'Area' having two 
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters 
and the second method named as 'getArea' returns the area of the rectangle. Length and breadth 
of rectangle are entered through keyboard*/



package assignment3;

import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double getArea() {
        return length * breadth;
    }
}

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Area rectangle = new Area();
        
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        
        rectangle.setDim(length, breadth);

        
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
/*OUTPUT 
Enter the length of the rectangle:
4
Enter the breadth of the rectangle:
5
The area of the rectangle is: 20.0*/
/*1. Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle 
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance 
variables and methods for each class. The private instance variables of Quadrilateral should 
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that 
instantiates objects of your classes and outputs each object's area (except Quadrilateral).*/

package assignment5;

import java.util.*;

class Quadrilateral{
	double x1,y1,x2,y2,x3,y3,x4,y4;
	Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
	}	
}
class Trapezoid extends Quadrilateral{
	Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	
	}
	double getArea() {
		double base1 = Math.abs(x1 - x2);
	    double base2 = Math.abs(x3 - x4);
	    double height = Math.abs(y1 - y4);
        System.out.print("for Trapezoid:");
	    return 0.5 * (base1 + base2) * height;	    
	}
}
class Parallelogram extends Quadrilateral{
	Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	
	}
	double getArea() {
		double base = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y4);
        System.out.print("for parallelogram:");
        return base * height;
	}
}
class Rectangle extends Quadrilateral{
	Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	
	}
	double getArea() {
		double base = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y4);
        System.out.print("for rectangle:");

        return base * height;
	}
}
class Square extends Quadrilateral{
	Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	
	}
	double getArea() {
        System.out.print("for square:");

		 double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
	        double side3 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
	        double side4 = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));

	        if (side1 == side2 && side2 == side3 && side3 == side4) {
	            return side1 * side1; // Area of square
	        } else {
	            System.out.println("Invalid coordinates for a square.");
	            return -1;
	        }
	}
}
public class pr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Square s1=new Square(2,4,3,6,7,3,4,2);
		Square s1=new Square(2,4,2,4,2,4,2,9);
		System.out.println(s1.getArea());
		Trapezoid t1=new Trapezoid(4,2,6,7,3,4,7,8);
		System.out.println(t1.getArea());
		Rectangle r1=new Rectangle(3,2,5,7,4,5,4,3);
		System.out.println(r1.getArea());
		Parallelogram p1=new Parallelogram(5,8,3,2,1,2,4,5);
		System.out.println(p1.getArea());
	}

}
/*OUTPUT
 * for square:Invalid coordinates for a square.
 
-1.0
for Trapezoid:18.0
for rectangle:2.0
for parallelogram:6.0
*/
/*5. Complete the following: 
 i) Create a package named org.shapes. 
 ii) Create some classes in the package representing some common geometric shapes like 
 Square, Triangle, Circle and so on. The classes should contain area and perimeter 
 methods in them. 
 iii) Compile the package. 
 iv) Use this package to find area and perimeter of different shapes as chosen by the user.*/







package org.shapes;

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

}

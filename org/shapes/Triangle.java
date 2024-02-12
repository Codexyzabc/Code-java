/*5. Complete the following: 
 i) Create a package named org.shapes. 
 ii) Create some classes in the package representing some common geometric shapes like 
 Square, Triangle, Circle and so on. The classes should contain area and perimeter 
 methods in them. 
 iii) Compile the package. 
 iv) Use this package to find area and perimeter of different shapes as chosen by the user.*/

package org.shapes;

public class Triangle {
	double base,height,side1,side2,side3;
	public Triangle(double base, double height, double side1, double side2, double side3) {
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		
	}
	public double getArea() {
		return 0.5*base*height;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}

}

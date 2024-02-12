/*5. Complete the following: 
 i) Create a package named org.shapes. 
 ii) Create some classes in the package representing some common geometric shapes like 
 Square, Triangle, Circle and so on. The classes should contain area and perimeter 
 methods in them. 
 iii) Compile the package. 
 iv) Use this package to find area and perimeter of different shapes as chosen by the user.*/



package org.shapes;

public class Square {
	double side;
	
	public Square(double side) {
		this.side=side;
	}
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}

}

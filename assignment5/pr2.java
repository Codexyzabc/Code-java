/*2. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone 
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override 
these two methods in each of the derived classes to calculate the volume and whole surface 
area of each type of three-dimensional objects. The dimensions of the objects are to be taken 
from the users and passed through the respective constructors of each derived class. Write a 
main method to test these classes. */

package assignment5;

import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();

    abstract double volume();
}

class Box extends ThreeDObject {
    double x, y, z;

    public Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double wholeSurfaceArea() {
        return (2 * (x * y + y * z + z * x));
    }

    public double volume() {
        return (x * y * z);
    }
}

class Cube extends ThreeDObject {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    public double volume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double wholeSurfaceArea() {
        return ((2 * 3.14 * r * h) + (2 * 3.14 * r * r));
    }

    public double volume() {
        return (3.14 * r * r * h);
    }

}

class Cone extends ThreeDObject {
    double r, h, l;

    public Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public double wholeSurfaceArea() {
        return (3.14 * r * (r + l));
    }

    public double volume() {
        return (((3.14 * r * r * h) / 3));
    }
}

public class pr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter dimensions for Box (x y z): ");
        double xBox = scanner.nextDouble();
        double yBox = scanner.nextDouble();
        double zBox = scanner.nextDouble();
        Box box = new Box(xBox, yBox, zBox);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        
        System.out.println("Enter side length for Cube: ");
        double sideCube = scanner.nextDouble();
        Cube cube = new Cube(sideCube);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        
        System.out.println("Enter dimensions for Cylinder (radius height): ");
        double rCylinder = scanner.nextDouble();
        double hCylinder = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(rCylinder, hCylinder);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        
        System.out.println("Enter dimensions for Cone (radius height slant height): ");
        double rCone = scanner.nextDouble();
        double hCone = scanner.nextDouble();
        double lCone = scanner.nextDouble();
        Cone cone = new Cone(rCone, hCone, lCone);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}


/*OUTPUT 
 * 
 * Enter dimensions for Box (x y z): 
6
8
9
Box Surface Area: 348.0
Box Volume: 432.0
Enter side length for Cube: 
8
Cube Surface Area: 384.0
Cube Volume: 512.0
Enter dimensions for Cylinder (radius height): 
9
8
Cylinder Surface Area: 960.84
Cylinder Volume: 2034.72
Enter dimensions for Cone (radius height slant height): 
9
9
7
Cone Surface Area: 452.16
Cone Volume: 763.02
*/

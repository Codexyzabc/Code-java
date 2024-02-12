/*/*5. Complete the following: 
 i) Create a package named org.shapes. 
 ii) Create some classes in the package representing some common geometric shapes like 
 Square, Triangle, Circle and so on. The classes should contain area and perimeter 
 methods in them. 
 iii) Compile the package. 
 iv) Use this package to find area and perimeter of different shapes as chosen by the user.*/


package org.shapes_1;

import org.shapes.*;

import java.util.*;

public class Driver {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n Menu");
			System.out.println("1 Square ");
			System.out.println("2 Triangle ");
			System.out.println("3 Circle");
			System.out.println("4 Exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: Square s=new Square(4);
			        System.out.println("Area is "+ s.getArea());
			        System.out.println("Perimeter is "+s.getPerimeter());
			        break;
			case 2: Triangle t=new Triangle(2,3,6,7,8.9);
					System.out.println("Area is "+ t.getArea());
			        System.out.println("Perimeter is "+t.getPerimeter());
			        break;
			case 3: Circle c=new Circle(5.0);
					System.out.println("Area is "+ c.getArea());
			        System.out.println("Perimeter is "+c.getPerimeter());
			        break;
			case 4: System.out.println("Exiting the system");
			        System.exit(0);
			default: 
				    System.out.println("Invalid Choice");
			
			}
			
			
			
			
		}while(choice!=4);
	}

}




/*Menu
1 Square 
2 Triangle 
3 Circle
4 Exit
Enter the choice
1
Area is 16.0
Perimeter is 16.0

 Menu
1 Square 
2 Triangle 
3 Circle
4 Exit
Enter the choice
2
Area is 3.0
Perimeter is 21.9

 Menu
1 Square 
2 Triangle 
3 Circle
4 Exit
Enter the choice
3
Area is 78.53981633974483
Perimeter is 31.41592653589793

 Menu
1 Square 
2 Triangle 
3 Circle
4 Exit
Enter the choice
4
Exiting the system
*/
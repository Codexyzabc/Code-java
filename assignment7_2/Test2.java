/*
2. Create an interface with at least one method, in its own package. Create a class in a
separate package. Add a protected inner class that implements the interface. In a third
package, inherit from your class and, inside a method, return an object of the protected
inner class, up casting to the interface during the return.
*/


package assignment7_2;

import assignment7.Problem2;
import assignment7_1.Test1;

public class Test2 extends Test1{

	public Problem2 complete() {
		Test1 ob1 = new Test1();
		Problem2 ob2 = ob1.new Inner();
		return ob2;
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.complete().display();

	}

}


/*I am inside package 2*/
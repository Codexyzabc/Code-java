/*
2. Create an interface with at least one method, in its own package. Create a class in a
separate package. Add a protected inner class that implements the interface. In a third
package, inherit from your class and, inside a method, return an object of the protected
inner class, up casting to the interface during the return.
*/




package assignment7_1;

import assignment7.Problem2;

public class Test1 {
	protected class Inner implements Problem2 {
		public Inner() {
			
		}
		public void display() {
			System.out.println("I am inside package 2");
		}
	}
}



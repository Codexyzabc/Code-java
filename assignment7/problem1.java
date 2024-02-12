/*1. Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main( ), create an object of your class and pass it to
each of the methods.*/

package assignment7;


interface A{
	void method1a();
	void method2a();
}
interface B{
	void method1b();
	void method2b();
	
}
interface C{
	void method1c();
	void method2c();
}


interface D extends A,B,C{
	void newmethod1d();
}

class Concrete{
	
}
class Test extends Concrete implements D{
	public void method1a() {
		System.out.println("I am method of A");
	}
	public void method2a() {
		System.out.println("I am also method of A");
	}
	
	public void method1b() {
		System.out.println("I am method of B");
	}
	public void method2b() {
		System.out.println("I am also method of B");
	}
	
	public void method1c() {
		System.out.println("I am method of C");
	}
	public void method2c() {
		System.out.println("I am also method of C");
	}
	
	public void newmethod1d() {
		System.out.println("I am a method of D");
	}
	
	
	public void method1(A obj) {
		System.out.println("I am object of interface A");
		obj.method1a();
		obj.method2a();
	}
	
	public void method2(B obj) {
		System.out.println("I am object of interface B");
		
	}
	
	public void method3(C obj) {
		System.out.println("I am object of interface C");
	}
	
	public void method4(D obj) {
		System.out.println("I am object of interface D");
	}
	
}
class problem1{
	public static void main(String[]args) {
		Test obj=new Test();
		obj.method1(obj);
		obj.method2(obj);
		obj.method3(obj);
		obj.method4(obj);
		
		
	}
}



/* 
I am object of interface A
I am method of A
I am also method of A
I am object of interface B
I am object of interface C
I am object of interface D*/





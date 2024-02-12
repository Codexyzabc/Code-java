/*3. Write a program that defines a class with one static variable called cnt. Create two or more 
objects of the class. The class also contains a method that increments the cnt variable 
whenever a new instance of the class is created. Write a driver class to test the above class.
*/
package assignment4;

class Counter {
    private static int cnt = 0;

    public Counter() {
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }
}

public class pr3 {
    public static void main(String[] args) {
        
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();

        
        System.out.println("Count after creating two objects: " + Counter.getCnt());

        
        Counter obj3 = new Counter();

       
        System.out.println("Count after creating three objects: " + Counter.getCnt());
    }
}
/* OUTPUT 
Count after creating two objects: 2
Count after creating three objects: 3
*/
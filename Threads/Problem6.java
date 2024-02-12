/*6. Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the threads
run in an infinite loop. However, thread “t1” must not increase “x” till that value of “x” is
printed by “t2” and “t2” must not print the same value of “x” more than once.
7. Define the classes for implementing “t1” and “t2”. Write appropriate methods for
accomplishing the above.*/

package Threads;

class Counter{
	int x=0;
	boolean flag=false;
	synchronized void increase() {
		x++;
		System.out.println("increasing");
	}
	synchronized void display() {
		System.out.println("counter:"+x);
	}
}
class Th1 extends Thread{
	Counter c;
	Th1(Counter c){
		this.c=c;

	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				c.display();
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
class T2 extends Thread{
	Counter c;
	T2(Counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				c.increase();
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
public class Problem6 {
	public static void main(String []args) {
		Counter c=new Counter();
		Th1 t1=new Th1(c);
		T2 t2=new T2(c);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}


/*counter:0
increasing
counter:1
increasing
counter:2
increasing
increasing
counter:4
*/

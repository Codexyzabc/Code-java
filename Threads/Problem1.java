/*1. Write a Java program that illustrates the use of the yield( ), start( ),stop( ),run ( ), sleep( ),
wait( ) and isAlive( ) methods.*/



package Threads;
class Rec{
	boolean flag=false;
	synchronized void runThread() {
		if(flag==false) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println("running "+Thread.currentThread().getName());
				Thread.yield();
			}catch(Exception e) {
				
			}
		}
	}
	synchronized void firstInp() {
		notify();
		flag=true;
		System.out.println("notifying");
	}
}
class Thread10 extends Thread {
	Rec r;
	Thread10(Rec r){
		this.r=r;
	}
	public void run() {
		r.firstInp();
	}
}
class Thread11 extends Thread {
	Rec r;
	Thread11(Rec r){
		this.r=r;
	}
	public void run() {
		r.runThread();
	}
}

public class Problem1 {
	public static void main(String[] args) throws InterruptedException {
		Rec r=new Rec();
		Thread10 t1=new Thread10(r);
		Thread11 t2=new Thread11(r);
		Thread11 t3=new Thread11(r);
		t1.start();
		
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
	}

}


/*notifying
true
running Thread-2
running Thread-2
running Thread-2
running Thread-2
running Thread-2
running Thread-1
running Thread-1
running Thread-1
running Thread-1
running Thread-1
*/
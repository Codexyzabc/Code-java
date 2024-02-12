package Threads;

public class Problem8 {
	public static Object Lock1=new Object();
	public static Object Lock2=new Object();
	
	static class Thread1 extends Thread{
		public void run() {
			synchronized(Lock1) {
				System.out.println("thread 1- holding Lock1");
			try {Thread.sleep(10);}
			catch(Exception e) {}
			System.out.println("Thread 1: waiting for Lock2");
			synchronized(Lock2) {
				System.out.println("Thread 1: holding both Lock1 and Lock2");
			}
		}
		}
	}
	static class Thread2 extends Thread{
		public void run() {
			synchronized(Lock2) {
				System.out.println("thread 2- holding Lock2");
			try {Thread.sleep(10);}
			catch(Exception e) {}
			System.out.println("Thread 2: waiting for Lock1");
			synchronized(Lock1) {
				System.out.println("Thread 2: holding both Lock1 and Lock2");
			}
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
/*thread 1- holding Lock1
thread 2- holding Lock2
Thread 2: waiting for Lock1
Thread 1: waiting for Lock2*/
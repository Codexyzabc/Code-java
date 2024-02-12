/*2. Write multithreaded program that continuously prints the strings “ping” and “PONG” in
the console at random distances at intervals of one second. Use two threads one for
“ping” and another for “PONG”.*/

package Threads;
class CustomThread1 extends Thread{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("ping");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
		}
	}
}
class CustomThread2 extends Thread{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("PONG");
				Thread.sleep(1000);

			}
		}
		catch(Exception e){
		}
	}
}
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomThread1 t1=new CustomThread1();
		CustomThread2 t2=new CustomThread2();
		t1.start();
		t2.start();

	}

}



/*PONG
ping
PONG
ping
ping
PONG
PONG
ping
ping
PONG
*/
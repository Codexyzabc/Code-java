/*Write a program to sort a list of strings using multithreading. Create one of the threads
//that take a string as input from the user, another thread that sorts the strings and finally
//another thread that displays the sorted list of strings. Each of the input, sort, and display
//methods is to be synchronized.*/



package Threads;

import java.util.Arrays;
import java.util.Scanner;
class Sorting{
	String[] inpt = {"Ani", "Sam", " Joe"};;
	boolean flag=false;
	boolean flag2=false;
	synchronized void setInput(){
		System.out.println("getting input");
//		System.out.println("please provide the string");
//		Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine();
//		this.inpt=input;
		flag=true;
		notifyAll();
		
	}
	synchronized void sort(){
		if(flag==false) {
			System.out.println("waiting for input");
			
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("sorting string");
		flag2=true;
		notifyAll();
		Arrays.sort(inpt);
	}
	synchronized void display(){
		
		
		if(!flag||!flag2) {
			System.out.println("waiting for sorting");
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("your output is:");
		for(int i=0;i<inpt.length;i++) {
			System.out.print(inpt[i]+" ");
		}
	}
}
class MyThread1 extends Thread{
	Sorting s;
	MyThread1(Sorting s){
		this.s=s;
	}
	public void run(){
		this.s.setInput();
	}
}
class MyThread2 extends Thread{
	Sorting s;
	MyThread2(Sorting s){
		this.s=s;
	}
	public void run(){
		this.s.sort();
	}
}
class MyThread3 extends Thread{
	Sorting s;
	MyThread3(Sorting s){
		this.s=s;
	}
	public void run(){
		this.s.display();
	}
}
public class Problem3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting s1=new Sorting();
		MyThread1 t1=new MyThread1(s1);
		MyThread2 t2=new MyThread2(s1);
		MyThread3 t3=new MyThread3(s1);
		t1.start();
		t2.start();
		t3.start();

	}

}
/*getting input
waiting for sorting
sorting string
your output is:
 Joe Ani Sam */
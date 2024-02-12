/*3. Write a program to create a class called MyStack that includes functions to perform all
operations on a stack as well as raises an exception whenever overflow/underflow error
occurs.*/

package Exception;

import java.util.*;

class OverflowException extends Exception{
	public OverflowException(String str) {
		super(str);
	}
}

class UnderflowException extends Exception{
	public UnderflowException(String str) {
		super(str);
	}
}

class Mystack{
	int size;
	int top=-1;
	int array[];
	public Mystack(int size) {
		this.size=size;
		this.array=new int[size];
	}
	
	public boolean isfull() throws OverflowException{
		if(top==size-1) {
			throw new OverflowException("stack overflows!!");
		}
		return false;
	}
	public boolean isempty() throws UnderflowException{
		if(top==-1) {
			throw new UnderflowException("stack underflows!!");
			
		}
		return false;
	}
	public void push(int data) throws OverflowException{
		
		if(isfull()==false) {
			top=top+1;
			array[top]=data;
			System.out.println("push operation done");
		}
	}
	public void pop() throws UnderflowException{
		if(isempty()==false) {
			int data=array[top];
			top=top-1;
			System.out.println("popped element"+data);
			
		}
	}
	
}


public class Prob3 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		Mystack stack=new Mystack(5);
		
		try {
			stack.push(6);
			stack.push(4);
			stack.push(7);
			stack.push(2);
			stack.push(7);
			stack.push(23);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
/*push operation done
push operation done
push operation done
push operation done
push operation done
Exception.OverflowException: stack overflows!!
popped element7
popped element2
popped element7
popped element4
popped element6
Exception.UnderflowException: stack underflows!!
*/
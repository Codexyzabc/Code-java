/*1. Write a program called Factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and “throw an
exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message “Value of x must be positive”.If x is above the length of the
array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.*/

package Exception;
import java.util.*;

class IllegalArgumentException extends Exception{
	public IllegalArgumentException(String str) {
		super(str);
	}
}

public class Prob1 {
	
	public static long factorial(long num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[]args) {
		
	     Scanner sc=new Scanner(System.in);
	     
	     long arr[]=new long[19];
	     
	     for(int i=1;i<20;i++) {
	    	 arr[i-1]=Prob1.factorial(i);
	     }
	     
	     System.out.println("Enter the number to find factorial ");
	     int x=sc.nextInt();
	     if(x<0) {
	     try {
	    	 
		      throw new IllegalArgumentException("Value of x must be positive");
		    	 	    	 
	     }catch(Exception e) {
	    	 System.out.println(e);
	    	 
	     }
	     }
	     else if(x>19) {
	    	 try {
	    		 throw new IllegalArgumentException("Result will overflow");
	    	 }catch(Exception e) {
	    		 System.out.println(e);
	    	 }
	     }
	     else {
	    	 System.out.println("The result is "+arr[x-1]);
	     }
	     
	}
	
}



/*Enter the number to find factorial 
10
The result is 3628800

 * Enter the number to find factorial 
-1
Exception.IllegalArgumentException: Value of x must be positive

 * Enter the number to find factorial 
21
Exception.IllegalArgumentException: Result will overflow

 */

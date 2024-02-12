/*2. Define an exception called “NoMatchFoundException” that is thrown when a string is
not equal to “University”. Write a program that uses this exception.*/

package Exception;

import java.util.*;

class NoMatchFoundException extends Exception{
	public NoMatchFoundException(String str) {
		super(str);
	}
}


public class Prob2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string equal to University");
		String str=sc.nextLine();
		
		if(str.equals("University")) {
			System.out.println("ok go on!!");
		}
		else {
			try {
				throw new NoMatchFoundException("It is not equal to University");
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
		
	}
}
/*Enter a string equal to University
		kj
		Exception.NoMatchFoundException: It is not equal to University
*/
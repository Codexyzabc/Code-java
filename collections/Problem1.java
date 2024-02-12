/*1. Write a program that reads in a series of first names and stores them in a LinkedList. Do not store
duplicate names. Allow the user to search for a first name. */


package collections;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number of users:");
		n=sc.nextInt();
		System.out.println("enter the names:");
		LinkedList<String> ll=new LinkedList<String>();
		sc.nextLine();
		while(n!=0){
		    String temp="";
		    temp=sc.nextLine();
		    if(ll.contains(temp)==false){
		    	
		    	ll.add(temp);
		    }
		    n--;
		}
		System.out.println("enter the name to be searched");
		String target="";
		target=sc.nextLine();
		if(ll.contains(target)){
		    System.out.println(target+" this user is present");
		}
		else{
		    System.out.println(target+ " this user is not present");
		}
	}

}
//enter the number of users:
//3
//enter the names:
//usr1
//user3
//user4
//enter the name to be searched
//user4
//user4 this user is present


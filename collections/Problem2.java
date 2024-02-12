/*2. Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
printed in ascending sorted order.] */

package collections;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("this is some text"," ");
		
		TreeSet<String> t=new TreeSet<String>();
		while(st.hasMoreTokens()){
			t.add(st.nextToken());
		}
		System.out.println(t);
		
		
	}

}
//[is, some, text, this]

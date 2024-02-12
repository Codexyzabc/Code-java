/* 3. Write a program that inputs the names of people into different array list, A and B. Array A has N
number of names while array B has M number of names, with no duplicates in either of them. Merge
arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
Display all the three arrays list, A, B and C, stored alphabetically.*/

package collections;
import java.util.*;
public class Problem3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> b=new ArrayList<String>();
		ArrayList<String> c=new ArrayList<String>();
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of the first set of names:");
		n=sc.nextInt();
		System.out.println("enter number of the second set of names:");
		m=sc.nextInt();
		System.out.println("enter the first set of names:");
		sc.nextLine();
		while(n!=0){
			String t1="";
			t1=sc.nextLine();
			if(a.contains(t1)==false){
				a.add(t1);
			}
			n--;
		}
		System.out.println("enter the second set of names:");

		while(m!=0){
			String t2="";
			t2=sc.nextLine();
			if(b.contains(t2)==false){
				b.add(t2);
			}
			m--;
		}
		
		Collections.sort(a);
		Collections.sort(b);
		c.addAll(a);
		c.addAll(b);
		Collections.sort(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
//enter number of the first set of names:
//2
//enter number of the second set of names:
//3
//enter the first set of names:
//name1
//name2
//enter the second set of names:
//name1
//name1
//name5
//[name1, name2]
//[name1, name5]
//[name1, name1, name2, name5]

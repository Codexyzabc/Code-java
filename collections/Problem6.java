/*6. Write a java program to check the number where the difference between every adjacent digit should be 1
using ArrayList. */
package collections;
import java.util.*;
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arr=new ArrayList<Integer>();
		int n;
		System.out.println("enter the number of the elements:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}
		for(int i=0;i<n-1;i++){
			if(Math.abs(arr.get(i)-arr.get(i+1))!=1){
				System.out.println("No! The array has atleast one adjacent difference of MORE THAN ONE");
				return;
			}
		}
		System.out.println("Yes! This array has difference 1 of adjacent elements");
		
	}

}
//enter the number of the elements:
//5
//enter the elements
//1
//2
//5
//6
//7
//No! The array has atleast one adjacent difference of MORE THAN ONE
//enter the number of the elements:
//5
//enter the elements
//1
//2
//5
//6
//7
//No! The array has atleast one adjacent difference of MORE THAN ONE
//

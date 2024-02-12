/*4. Write a program to find whether an array is subset of another array or not. */

package collections;
import java.util.*;
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,4,5,6,7,8};
		int arr2[]={4,6,9};
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++){
			m.put(arr1[i],i);
		}

		// for(HashMap.Entry<Integer,Integer> entry : m.entrySet()){
		// 	System.out.println("key: "+entry.getKey()+"value "+entry.getValue());
		// }


		for(int j=0;j<arr2.length;j++){
			if(!m.containsKey(arr2[j])){
				System.out.println("this second array is not a subset of the first array");
				return;
			}
		
		}
		System.out.println("Yes! second array is the subset of the first array");
		
	}

}
//this second array is not a subset of the first array


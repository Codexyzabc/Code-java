/*5. Write a program to find elements which are present in first array and not in second array. */
package collections;

import java.util.HashMap;

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,4,5,6,7,8};
		int arr2[]={4,6,9};
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int j=0;j<arr2.length;j++){
			m.put(arr2[j], 1);
		}

		for(HashMap.Entry<Integer,Integer> entry : m.entrySet()){
			System.out.println("key: "+entry.getKey()+"value "+entry.getValue());
		}

		for(int i=0;i<arr1.length;i++){
			if(m.containsKey(arr1[i])==false){
				System.out.println(arr1[i]);
			}
		}
	}
}
//2
//5
//7
//8


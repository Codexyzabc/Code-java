package assignment6;

import java.util.*;
//Write a Java class called ArrayExample to declare an array of String objects called
//Products of the size 10, assign values to each element while declarations and print and
//sort them.
class ArrayExample{
	String products[]=new String[10];
	ArrayExample(String str[]){
		for(int i=0;i<10;i++){
			products[i]=str[i];
		}
		
	}
	void getSorted() {
	    System.out.println("Before sorting:");
	    for (int i = 0; i < 10; i++) {
	        System.out.print(products[i] + " ");
	    }
	    System.out.println();

	    for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < 10 - 1 - i; j++) {
	            if (products[j].compareTo(products[j + 1]) > 0) {
	                String temp = products[j];
	                products[j] = products[j + 1];
	                products[j + 1] = temp;
	            }
	        }
	    }

	    System.out.println("After sorting:");
	    for (int i = 0; i < 10; i++) {
	        System.out.print(products[i] + " ");
	    }
	}

}
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the elements(10):");
		for (int i=0;i<=9;i++){
			String temp=sc.nextLine();
			str[i]=temp;
		}
		ArrayExample a1=new ArrayExample(str);
		a1.getSorted();
	}

}






/*enter the elements(10):
realme
appl
nikon
tesla
verna
hundai
benz
audi
samsung
galaxy
Before sorting:
realme appl nikon tesla verna hundai benz audi samsung galaxy 
After sorting:
appl audi benz galaxy hundai nikon realme samsung tesla verna */


import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare an array of String objects called Products with a size of 10
        String[] products = {"Laptop", "Phone", "Tablet", "Headphones", "Camera", 
                             "Printer", "Smartwatch", "Speakers", "Keyboard", "Mouse"};

        // Print the values of the array
        System.out.println("Original array:");
        printArray(products);

        // Sort the array
        Arrays.sort(products);

        // Print the sorted array
        System.out.println("\nSorted array:");
        printArray(products);
    }

    // Method to print the elements of an array
    private static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }
}

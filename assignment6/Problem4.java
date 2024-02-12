package assignment6;


//Write a program to accept a string from the user and find out the following statistics:
//
//(a) Count of uppercase character
//(b) Count of lowercase character
//(c) Count of digits
//(d) Count of spaces
import java.util.*;


public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int upper=0, lower=0, digits=0, spaces=0;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				upper++;
			}
			else if(Character.isLowerCase(s.charAt(i))){
				lower++;
			}
			else if(s.charAt(i)==' '){
				spaces++;
			}
			else if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9){
				digits++;
			}
		}
		System.out.println("number of uppercase: "+upper+"\nnumber of lowercase: "+lower+"\nnumber of spaces: "+spaces+"\nnumber of digits: "+digits);

	}

}

/*I am Sougota10
number of uppercase: 2
number of lowercase: 8
number of spaces: 2
number of digits: 2*/


import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Initialize counts
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        // Iterate through each character in the input string
        for (char ch : inputString.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }

        // Display the statistics
        System.out.println("Count of Uppercase Characters: " + uppercaseCount);
        System.out.println("Count of Lowercase Characters: " + lowercaseCount);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Count of Spaces: " + spaceCount);
    }
}

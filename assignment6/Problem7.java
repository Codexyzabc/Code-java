

//Write a program to determine if a string has all Unique Characters.[remove white space]
//Given a string, determine if the string has all unique characters.
/* 
public class Problem7 {

	
	public static boolean hasUniqueCharacters(String str) {
        
        str = str.replaceAll("\\s", "");

        
        char[] charArray = str.toCharArray();

        
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {
        String str1 = "ab cd 10jk";
        System.out.println("Output for \"" + str1 + "\": " + hasUniqueCharacters(str1));

        String str2 = "hutg9mnd!nk9";
        System.out.println("Output for \"" + str2 + "\": " + hasUniqueCharacters(str2));
    }
}*/
package assignment6;

public class Problem7 {

    public static boolean hasUniqueCharacters(String str) {
        str = str.replaceAll("\\s", "");
        char[] charArray = str.toCharArray();

        // Bubble sort to sort the characters
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Check for duplicate characters after sorting
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "ab cd 10jk";
        System.out.println("Output for \"" + str1 + "\": " + hasUniqueCharacters(str1));

        String str2 = "1ji2k1";
        System.out.println("Output for \"" + str2 + "\": " + hasUniqueCharacters(str2));
    }
}




//Output for "ab cd 10jk": true
//Output for "hutg9mnd!nk9": false

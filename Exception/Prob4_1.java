/*4. Write a class that keeps a running total of all characters passed to it (one at a time) and
throws an exception if it is passed a non-alphabetic character.*/

package Exception;

import java.util.*;

class NonAlphabetException extends Exception {
    public NonAlphabetException(String msg) {
        super(msg);
    }
}

class CharCount {
    private int charCount;

    CharCount() {
        charCount = 0;
    }

    public boolean isChar(char c) throws NonAlphabetException {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            throw new NonAlphabetException("Non-alphabet character encountered: " + c);
        }
    }

    public void processString(String str) {
        for (char c : str.toCharArray()) {
            try {
                if (isChar(c)) {
                    charCount++;
                }
            } catch (Exception e) {
                System.out.println(e);               
            }
        }
    }

    public int getCharCount() {
        return charCount;
    }
}

public class Prob4_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        CharCount charCounter = new CharCount();
        charCounter.processString(str);

        System.out.println("Total Alphabetic Characters: " + charCounter.getCharCount());
    }
}


/*Enter a string:
sougota
Total Alphabetic Characters: 7
Enter a string:
soug123gota
Exception.NonAlphabetException: Non-alphabet character encountered: 1
Exception.NonAlphabetException: Non-alphabet character encountered: 2
Exception.NonAlphabetException: Non-alphabet character encountered: 3
Total Alphabetic Characters: 8
*/
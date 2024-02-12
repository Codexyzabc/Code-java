package assignment6;

/*6. Write a method (not the entire application) called CountVowels, which takes the input 
arguments as character and checks whether it is a vowel; increment the instance variable 
called vCnt by 1.*/

public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="Yoo hopefully this will work";
		String check="aeiouAEIOU";
		int vCnt=0;
		for(int i=0;i<test.length();i++){
			for(int j=0;j<check.length();j++){
				if(test.charAt(i)==check.charAt(j)){
					vCnt++;
				}
			}
		}
		System.out.println("total number of vowel:"+vCnt);

	}

}
//total number of vowel:8


public class VowelCounter {
    private int vCnt = 0; // Instance variable to store the count of vowels

    // Method to count vowels and update vCnt
    public void countVowels(char ch) {
        // Convert the character to lowercase for case-insensitive comparison
        char lowercaseCh = Character.toLowerCase(ch);

        // Check if the character is a vowel (a, e, i, o, u)
        if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
            vCnt++; // Increment vCnt if the character is a vowel
        }
    }

    // Getter method to retrieve the count of vowels
    public int getVowelCount() {
        return vCnt;
    }

    // Example usage
    public static void main(String[] args) {
        VowelCounter vowelCounter = new VowelCounter();

        // Example characters to test the method
        char[] characters = {'a', 'B', 'e', 'G', 'i', 'O', 'u', 'X'};

        // Iterate through the characters and count vowels
        for (char ch : characters) {
            vowelCounter.countVowels(ch);
        }

        // Display the count of vowels
        System.out.println("Count of vowels: " + vowelCounter.getVowelCount());
    }
}

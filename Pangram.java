/*
Algorithm :

If the length of the sentence is less than 26, 
   then the sentence is not a pangram.

2. We will check if every letter of alphabet is present in the sentence.
   For alphabet = 'A' to 'Z'
       If 
           alphabet is not present in the string
       Then
           return false // Sentence is not a pangram
       End if
    End for
    
    return true   // Sentence is a pangram
*/

public class Pangram {

	private static final int NO_OF_LETTERS_OF_ALPHABET = 26;

	public static void main(String[] args) {
		String sentence = "Freight to me sixty dozen quart jars and twelve "
				+ "black pans.";
		System.out.println("Is pangram : " + isPangram(sentence));
	}

	private static boolean isPangram(String sentence) {

		if (sentence.length() < NO_OF_LETTERS_OF_ALPHABET) {
			return false;
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (sentence.indexOf(ch) < 0
					&& sentence.indexOf((char) (ch + 32)) < 0) {
				return false;
			}
		}

		return true;
	}
}
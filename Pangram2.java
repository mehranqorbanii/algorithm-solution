/*
Algorithm:

Let str be the given string with length n.
1. Create an integer array of size 26 which will hold the frequency of alphabets.
   Let the array name be alphabets. Index at 0 will hold frequency of 'A' and index 
   at 1 will hold the frequency of 'B' and so on.
2. Populate frequency of alphabets in above array.
   Iterate over characters of str
   for i = 0 to n
       If the character is an alphabet
           Increment the frequency of the character
        End if
   End for

3. Check if alphabets has zero.
   Iterate over alphabets.
   for i =0 to 26
      If alphabets[i] == 0
         return true
      End if
   End for
  
   return true
*/

public class Pangram2 {

	private static boolean isPangram(String str) {
		if (str == null || str.length() < 26) {
			return false;
		}

		// Holds the frequency of alphabets.
		// zeroth index holds frequency of a, first index holds frequency of b
		// and so on
		int[] albhabets = new int[26];

		char[] strChars = str.toCharArray();

		populateAlphabetFrequency(albhabets, strChars);

		return isAlphabetFrequencyNonZero(albhabets);
	}

	private static void populateAlphabetFrequency(int[] albhabets,
			char[] strChars) {
		
		int len = strChars.length;
		
		for (int i = 0; i < len; i++) {
			char ch = strChars[i];
			if (ch >= 97 && ch <= 122) {
				albhabets[ch - 97]++;
			} else if (ch >= 65 && ch <= 90) {
				albhabets[ch - 65]++;
			}
		}
	}

	private static boolean isAlphabetFrequencyNonZero(int[] albhabets) {
		for (int i = 0; i < 26; i++) {
			if (albhabets[i] == 0) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		System.out.println("Is pangram : " + isPangram(str));
	}
}
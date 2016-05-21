public class Anagram2 {

	private static boolean isAnagram(String str1, String str2) {
		// If length of strings are not same, the strings are not anagrams.
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}

		char[] str1Chars = str1.toLowerCase().toCharArray();
		StringBuilder builder = new StringBuilder(str2.toLowerCase());

		for (Character ch : str1Chars) {

			// Find the index of the current character in builder.
			int index = builder.indexOf(String.valueOf(ch));
			if (index == -1) {
				return false;
			}
			// Remove the character from builder so that multiple occurrences of
			// a character in the first string will be matched with equal number
			// of occurrences of the character in the second string.
			builder.delete(index, index + 1);
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "rta";
		String str2 = "art";
		if (isAnagram(str1, str2)) {
			System.out.println(str2 + " is anagram of " + str1);
		} else {
			System.out.println("Strings are not anagrams.");
		}
	}
}
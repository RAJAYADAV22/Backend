package string_Methods;

public class Sting_Methods_Ex {
	public static void main(String[] args) {
		String Name = "Rajayadav";
		String Name1 = "Rajuyadav";
		String Name2 = "****";
		System.out.println(Name.length()); // The length() returns the length of a string
		System.out.println(Name.toUpperCase()); // The toupperCase() property converts the string into UpperCase
		System.out.println(Name.toLowerCase()); // The toLowerCase() property converts the string into LowerCase
		System.out.println(Name.charAt(1)); // The charAt() gives the index value of the character
		System.out.println(Name.compareTo(Name1));// The compareTo() gives the comparison of two strings and writes the
													 //difference
		System.out.println(Name.equals(Name1)); // The equals() returns true if the two strings are equal Orelse
												// viceversa
		System.out.println(Name.equalsIgnoreCase(Name1));// The equalsIgnoreCase() returns True if both strings are
															// equal or not
		System.out.println(Name.codePointAt(1)); // The codepointAt() returns the ascii value of the character of the
													// string.
		System.out.println(Name.concat(Name1)); // Appends a string to the end of another string
		System.out.println(Name.contentEquals(Name1)); // Checks whether a string contains the exact same sequence of
														// characters of the specified CharSequence or StringBuffer
		System.out.println(Name.indexOf(Name1)); // Returns the position of the first found occurrence of specified
													// characters in a string
		System.out.println(Name.codePointBefore(2)); // Returns the Unicode of the character before the specified index
		System.out.println(Name.codePointCount(0, 9)); // Returns the number of Unicode values found in a string.
		System.out.println(Name.contains(Name1)); // Checks whether a string contains a sequence of characters
		System.out.println(Name.endsWith("v")); // Checks whether a string ends with the specified character(s)
		System.out.println(Name.getBytes()); // Converts a string into an array of bytes
		System.out.println(Name.hashCode()); // Returns the hash code of a string
		System.out.println(Name.intern()); // Returns the canonical representation for the string object
		System.out.println(Name2.isEmpty()); // Checks whether a string is empty or not
		System.out.println(Name.lastIndexOf(Name1)); // Returns the position of the last found occurrence of specified
														// characters in a string
		System.out.println(Name.matches(Name1)); // Searches a string for a match against a regular expression, and
													// returns the matches
		System.out.println(Name.replace('a', 'z')); // Searches a string for a specified value, and returns a new string
													// where the specified values are replaced
		System.out.println(Name1.replaceAll(Name1, "Abilash")); // Replaces each substring of this string that matches
																// the given regular expression with the given
																// replacement
		System.out.println(Name.replaceFirst(Name, "Raja")); // Replaces the first occurrence of a substring that
																// matches the given regular expression with the given
																// replacement
		System.out.println(Name.startsWith("R"));// Checks whether a string starts with specified characters
		System.out.println(Name.subSequence(4, 9)); // Returns a new character sequence that is a subsequence of this
													// sequence
		System.out.println(Name.substring(0, 4)); // Returns a new string which is the substring of a specified string
		System.out.println(Name.toString()); // Returns the value of a String object
		System.out.println(Name1.trim()); // Removes whitespace from both ends of a string
		System.out.println(String.valueOf(Name)); // Returns the string representation of the specified value
		System.out.println(String.format(Name2)); // Returns a formatted string using the specified locale, format
													// string, and arguments
	}
}

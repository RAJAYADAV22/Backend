package string_Tasks;

public class SecondOccurrenceCapital {
	public static void main(String[] args) {
		String inputString = "bvrit college";
		String modifiedString = convertSecondOccurrenceToCapital(inputString, 'l');

		System.out.println("Original string: " + inputString);
		System.out.println("Modified string: " + modifiedString);
	}

	public static String convertSecondOccurrenceToCapital(String str, char ch) {
		int firstIndex = str.indexOf(ch);
		int secondIndex = str.lastIndexOf(ch);
		if (firstIndex != -1 && secondIndex != -1 && firstIndex != secondIndex) {
			StringBuilder modified = new StringBuilder(str);
			modified.setCharAt(secondIndex, Character.toUpperCase(str.charAt(secondIndex)));
			return modified.toString();
		} else {
			return str;
		}
	}
}


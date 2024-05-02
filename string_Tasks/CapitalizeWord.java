package string_Tasks;

public class CapitalizeWord {
	public static void main(String[] args) {
		String inputString = "b.v.raju college";
		String wordToConvert = "raju";
		String modifiedString = convertWordToCapital(inputString, wordToConvert);

		System.out.println("Original string: " + inputString);
		System.out.println("Modified string: " + modifiedString);
	}

	public static String convertWordToCapital(String str, String word) {
		String regex = "\\b" + word + "\\b";
		String modifiedString = str.replaceAll(regex, word.toUpperCase());

		return modifiedString;
	}
}


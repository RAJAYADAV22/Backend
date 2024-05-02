package string_Tasks;

public class CapitalLetters {
	public static void main(String[] args) {
		String inputString = "Hello, How Are You?";

		System.out.println("Capital letters in the string:");
		printCapitalLetters(inputString);
	}

	public static void printCapitalLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
	}
}


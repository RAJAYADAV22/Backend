package string_Tasks;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {
		String s = "java standard edition";
		String capitalizedString = capitalizeFirstLetter(s);
		System.out.println("Original String: " + s);
		System.out.println("String with first letter of each word capitalized: " + capitalizedString);
	}

	public static String capitalizeFirstLetter(String str) {
		String[] words = str.split("\\s+");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}
		return result.toString().trim();
	}
}

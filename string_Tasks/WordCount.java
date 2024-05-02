package string_Tasks;

public class WordCount {
	public static void main(String[] args) {
		String inputString = "Hello, how are you today?";
		int wordCount = countWords(inputString);

		System.out.println("Number of words in the string: " + wordCount);
	}

	public static int countWords(String str) {
		String[] words = str.split("\\s+");
		return words.length;
	}
}


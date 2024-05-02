package string_Tasks;

public class StringContainsSequence {
	public static void main(String[] args) {
		String inputString = "welcome to carrertuner";
		String sequence = "carrer";

		boolean containsSequence = containsSequence(inputString, sequence);

		if (containsSequence) {
			System.out.println("The string contains the specified sequence: " + sequence);
		} else {
			System.out.println("The string does not contain the specified sequence: " + sequence);
		}
	}

	public static boolean containsSequence(String str, String sequence) {
		return str.matches(".*" + sequence + ".*");
	}
}

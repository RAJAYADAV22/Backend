package string_Tasks;

public class CheckEndsWith {
	public static void main(String[] args) {
		String str1 = "Hello, World!";
		String str2 = "World!";

		boolean endsWithStr2 = checkEndsWith(str1, str2);

		if (endsWithStr2) {
			System.out.println("The string \"" + str1 + "\" ends with \"" + str2 + "\"");
		} else {
			System.out.println("The string \"" + str1 + "\" does not end with \"" + str2 + "\"");
		}
	}

	public static boolean checkEndsWith(String str1, String str2) {
		return str1.endsWith(str2);
	}
}

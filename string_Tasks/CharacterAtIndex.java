package string_Tasks;

import java.util.Scanner;

public class CharacterAtIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		System.out.print("Enter the index to retrieve the character: ");
		int index = scanner.nextInt();
		char characterAtIndex = getCharacterAtIndex(inputString, index);

		if (characterAtIndex != '\0') {
			System.out.println("Character at index " + index + ": " + characterAtIndex);
		} else {
			System.out.println("Invalid index.");
		}

		scanner.close();
	}

	public static char getCharacterAtIndex(String str, int index) {
		if (index >= 0 && index < str.length()) {
			return str.charAt(index);
		} else {
			return '\0';
		}
	}
}

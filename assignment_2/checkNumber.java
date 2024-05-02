package assignment_2;

public class checkNumber {
	public boolean isIncreasingNumber(int number) {
		String numStr = String.valueOf(number);
		for (int i = 0; i < numStr.length() - 1; i++) {
			if (numStr.charAt(i) >= numStr.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		checkNumber checker = new checkNumber();
		int num1 = 1234;
		int num2 = 9876;
		int num3 = 13579;
		int num4 = 987543;
		System.out.println(num1 + " is an increasing number: " + checker.isIncreasingNumber(num1));
		System.out.println(num2 + " is an increasing number: " + checker.isIncreasingNumber(num2));
		System.out.println(num3 + " is an increasing number: " + checker.isIncreasingNumber(num3));
		System.out.println(num4 + " is an increasing number: " + checker.isIncreasingNumber(num4));
	}
}

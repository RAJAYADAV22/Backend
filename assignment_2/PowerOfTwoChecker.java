package assignment_2;

public class PowerOfTwoChecker  {
	public static boolean checkNumber(int n) {
		if (n <= 0) {
			return false;
		}

		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		int number = 8;
		System.out.println(number + " is a power of two: " + checkNumber(number));
	}
}



package assignment_2;

public class DifferenceCalculator {
	public static void main(String[] args) {
		int n = 10;
		int difference = calculateDifference(n);
		System.out.println("Difference for n = " + n + ": " + difference);
	}

	public static int calculateDifference(int n) {
		int sumOfSquares = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sumOfSquares += i * i;
			sum += i;
		}
		int squareOfSum = sum * sum;
		int difference = sumOfSquares - squareOfSum;

		return difference;
	}
}

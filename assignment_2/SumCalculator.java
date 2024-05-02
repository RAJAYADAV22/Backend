package assignment_2;

public class SumCalculator {
	public int sumOfMultiples(int n) {
		int sum = 0;
		int count = 0;
		int number = 1;
		while (count < n) {
			if (number % 3 == 0 || number % 5 == 0) {
				sum += number;
				count++;
			}
			number++;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumCalculator calculator = new SumCalculator();
		int n = 10;
		int result = calculator.sumOfMultiples(n);
		System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
	}
}


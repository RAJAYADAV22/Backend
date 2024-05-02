package arrays.java;

public class ArraySumAverage {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		int sum = calculateSum(array);
		double average = calculateAverage(array);
		System.out.println("Sum of elements: " + sum);
		System.out.println("Average of elements: " + average);
	}

	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	public static double calculateAverage(int[] arr) {
		int sum = calculateSum(arr);
		double average = (double) sum / arr.length;
		return average;
	}
}

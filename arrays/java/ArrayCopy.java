package arrays.java;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] originalArray = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] copiedArray = new int[8];
		for (int i = 0; i < originalArray.length; i++) {
			copiedArray[i] = originalArray[i];
		}
		System.out.println("Original Array:");
		displayArray(originalArray);
		System.out.println("\nCopied Array:");
		displayArray(copiedArray);
	}

	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


package arrays.java;

public class ArraySquare {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Square of elements:");
		displaySquare(array);
	}

	public static void displaySquare(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int square = arr[i][j] * arr[i][j];
				System.out.print(square + " ");
			}
			System.out.println();
		}
	}
}



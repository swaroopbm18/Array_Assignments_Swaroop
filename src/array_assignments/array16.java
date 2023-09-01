package array_assignments;

/*
 * This program consists of solution for Question 16 , Question 26 and Question 27 
 */

public class array16 {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		System.out.println("Original arrays:");
		printArray(array1, "Array1: ");
		printArray(array2, "Array2: ");

		int[] temp = array1;
		array1 = array2;
		array2 = temp;

		System.out.println("\nArrays after swapping:");
		printArray(array1, "Array1: ");
		printArray(array2, "Array2: ");
	}

	public static void printArray(int[] arr, String label) {
		System.out.print(label);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}

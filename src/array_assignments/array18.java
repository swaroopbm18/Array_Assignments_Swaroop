package array_assignments;

/*
 * This program consists of solution for Question 18
 */

public class array18 {
	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = new int[sourceArray.length];
		
		System.out.println("The Array before Copying:");
		System.out.println("Source Array:");
		displayArray(sourceArray);
		System.out.println("\nDestination Array:");
		displayArray(destinationArray);

		for (int i = 0; i < sourceArray.length; i++) {
			destinationArray[i] = sourceArray[i];
		}
		
		System.out.println("\nThe Array after Copying:");

		System.out.println("Source Array:");
		displayArray(sourceArray);

		System.out.println("\nDestination Array:");
		displayArray(destinationArray);
	}

	public static void displayArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

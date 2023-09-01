package array_assignments;

/*
 * This program consists of solution for Question 23
 */

import java.util.Scanner;

public class array23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements (n): ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("\nSum of all elements in the array: " + sum);

		scanner.close();
	}
}

package array_assignments;

/*
 * This program consists of solution for Question 21 and Question 22
 */

import java.util.Scanner;

public class array21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements (n): ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Elements at even positions:");
		for (int i = 0; i < n; i += 2) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nElements at odd positions:");
		for (int i = 1; i < n; i += 2) {
			System.out.print(arr[i] + " ");
		}

		scanner.close();
	}
}

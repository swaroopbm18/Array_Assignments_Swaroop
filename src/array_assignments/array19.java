package array_assignments;

/*
 * This program consists of solution for Question 19
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class array19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("Original array:");
		printArray(arr);

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : arr) {
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} 
			else {
				frequencyMap.put(num, 1);
			}
		}

		System.out.println("\nFrequency of each element:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}

		scanner.close();
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

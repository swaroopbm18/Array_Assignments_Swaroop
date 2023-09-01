package array_assignments;

/*
 * This program consists of solution for Question 10
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class array10 {
	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the integer to be added to the array: ");
			int num = scanner.nextInt();
			res.add(num);

			System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
			String choice = scanner.next();
			scanner.nextLine();

			if (!choice.equals("y")) {
				System.out.println("The final array is: " + res);
				removeDuplicates(res);
				break;
			}
		}

		scanner.close();
	}

	public static void removeDuplicates(ArrayList<Integer> arr) {
		Set<Integer> seen = new HashSet<>();
		ArrayList<Integer> uniqueList = new ArrayList<>();

		for (Integer num : arr) {
			if (!seen.contains(num)) {
				seen.add(num);
				uniqueList.add(num);
			}
		}

		System.out.println("Array after removing duplicates: " + uniqueList);
	}
}

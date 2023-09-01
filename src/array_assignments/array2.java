package array_assignments;

/*
 * This program consists of solution for Question 2 and Question 3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number to be added to array: ");
			int a = scanner.nextInt();
			res.add(a);

			System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
			String choice = scanner.next();

			if (!choice.equals("y")) {
				System.out.println("The final array is: " + res);

				while (true) {
					System.out.print("Enter the number to be found in the array: ");
					int b = scanner.nextInt();
					boolean found = false;

					for (int i = 0; i < res.size(); i++) {
						if (res.get(i) == b) {
							System.out.println("The number " + b + " is present at index " + i);
							found = true;
							break;
						}
					}

					if (!found) {
						System.out.println("The number " + b + " is not present in the array");
					}

					System.out.print(
							"Do you want to continue searching? Press 'y' to continue or any other key to exit: ");
					String ch = scanner.next();

					if (!ch.equals("y")) {
						System.out.println("The program execution is over!");
						break;
					}
				}

				break;
			}
		}

		scanner.close();
	}
}

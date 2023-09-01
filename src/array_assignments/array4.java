package array_assignments;

/*
 * This program consists of solution for Question 4
 */

import java.util.ArrayList;
import java.util.Scanner;

public class array4 {
	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number to be added to the array: ");
			int a = scanner.nextInt();
			res.add(a);

			System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
			String choice = scanner.next();

			if (!choice.equals("y")) {
				System.out.println("The final array is: " + res);

				while (true) {
					System.out.print("Enter the number to be removed from the array: ");
					int elementToRemove = scanner.nextInt();
					if (res.contains(elementToRemove)) {
						res.remove(Integer.valueOf(elementToRemove));
						System.out.println("The array after removing " + elementToRemove + ": " + res);
					} 
					else {
						System.out.println("Enter a value that exists in array to remove it");
						continue;
					}
					System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
					String ch = scanner.next();
					if (!ch.equals("y")) {
						System.out.println("The program execution is over!");
						System.out.println("The array after execution of this program is:" + res);
						break;
					}
				}

				break;
			}
		}

		scanner.close();
	}
}

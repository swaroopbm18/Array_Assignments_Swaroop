package array_assignments;

/*
 * This program consists of solution for Question 11 and Question 12
 */

import java.util.ArrayList;
import java.util.Scanner;

public class array11 {
	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number to be added to the array: ");
			int a = scanner.nextInt();

			if (res.contains(a)) {
				System.out.println("The number already exists! Enter a different number");
				continue;
			}

			res.add(a);

			System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
			String choice = scanner.next();

			if (!choice.equals("y")) {
				System.out.println("The final array is: " + res);

				int min = Integer.MAX_VALUE;
				int secondMin = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				int secondMax = Integer.MIN_VALUE;

				for (int num : res) {
					if (num < min) {
						secondMin = min;
						min = num;
					} else if (num < secondMin && num != min) {
						secondMin = num;
					}

					if (num > max) {
						secondMax = max;
						max = num;
					} else if (num > secondMax && num != max) {
						secondMax = num;
					}
				}

				System.out.println("The smallest number in array is: " + min);
				System.out.println("The 2nd smallest number in array is: " + secondMin);
				System.out.println("The largest number in array is: " + max);
				System.out.println("The 2nd largest number in array is: " + secondMax);

				break;
			}
		}

		scanner.close();
	}
}

package array_assignments;

/*
 * This program consists of solution for Question 1 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class array1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

				int sum = 0;
				for (int num : res) {
					sum += num;
				}
				double average = (double) sum / res.size();
				System.out.println("The average of list is: " + average);

				break;
			}
		}

		scanner.close();
	}
}

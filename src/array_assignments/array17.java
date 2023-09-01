package array_assignments;

/*
 * This program consists of solution for Question 17
 */

public class array17 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;

		System.out.println("Before swapping:");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

		int temp;

		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;

		System.out.println("After swapping:");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
	}
}

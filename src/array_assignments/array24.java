package array_assignments;

/*
 * This program consists of solution for Question 24 and Question 25
 */


import java.util.Arrays;
import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("\nArray in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

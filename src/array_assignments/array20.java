package array_assignments;

/*
 * This program consists of solution for Question 19
 */

import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Array in original order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.println("\nArray in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}

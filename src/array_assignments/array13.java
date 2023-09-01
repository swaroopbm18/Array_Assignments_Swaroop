package array_assignments;

/*
 * This program consists of solution for Question 13
 */

import java.util.Scanner;

public class array13 {
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

        int[] evenNumbers = new int[n];
        int evenCount = 0;
        int[] oddNumbers = new int[n];
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenCount] = num;
                evenCount++;
            } else {
                oddNumbers[oddCount] = num;
                oddCount++;
            }
        }
        
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        scanner.close();
    }
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

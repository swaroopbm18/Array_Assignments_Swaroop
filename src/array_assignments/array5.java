package array_assignments;

/*
 * This program consists of solution for Question 5
 */

import java.util.ArrayList;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number to be added to array: ");
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
                int max = Integer.MIN_VALUE;
                
                for (int num : res) {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
                
                System.out.println("The smallest number in array is: " + min);
                System.out.println("The largest number in array is: " + max);
                
                break;
            }
        }
        
        scanner.close();
    }
}

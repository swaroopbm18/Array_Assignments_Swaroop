package array_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class array7 {
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
                findDuplicates(res);
                break;
            }
        }
        
        scanner.close();
    }
    
    public static void findDuplicates(ArrayList<Integer> arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values in the array are: " + duplicates);
        }
    }
}

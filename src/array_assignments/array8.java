package array_assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class array8 {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the string to be added to array: ");
            String str = scanner.nextLine();
            
            res.add(str);
            
            System.out.print("Do you want to continue? Press 'y' to continue or any other key to exit: ");
            String choice = scanner.next();
            scanner.nextLine(); // Consume newline after reading choice
            
            if (!choice.equals("y")) {
                System.out.println("The final array is: " + res);
                findDuplicates(res);
                break;
            }
        }
        
        scanner.close();
    }
    
    public static void findDuplicates(ArrayList<String> arr) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        
        for (String str : arr) {
            if (seen.contains(str)) {
                duplicates.add(str);
            } else {
                seen.add(str);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values in the array are: " + duplicates);
        }
    }
}

package array_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array6 {
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
                Collections.reverse(res);
                System.out.println("The reverse array is: " + res);
                break;
            }
        }
        
        scanner.close();
    }
}

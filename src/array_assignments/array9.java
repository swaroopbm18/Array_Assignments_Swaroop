package array_assignments;

/*
 * This program consists of solution for Question 9 
 */

import java.util.ArrayList;

public class array9 {
	public static void main(String[] args) {
		String[] str1 = { "Anu", "Swaroop", "Sakshi", "Shashank", "Akanksha", "Madhurima", "Pruthvi" };
		String[] str2 = { "Swaroop", "Anu", "Archana", "Varshini", "Pruthvi", "Sakshi" };
		ArrayList<String> res = new ArrayList<>();

		for (String s1 : str1) {
			for (String s2 : str2) {
				if (s1.equals(s2)) {
					res.add(s2);
				}
			}
		}
		System.out.print("The common strings fron both arrays are: ");
		System.out.println(res);
	}
}

package Homework;

import java.util.*;

public class ListBuilder {
	static HashMap<String, Integer> unit = new HashMap<String, Integer>();
	static int counter;

	public static void main(String[] args) {

		counter = unit.size();

		Scanner sc = new Scanner(System.in);
		System.out.println("Select from a,b or c to continue.");
		System.out.println("a: View entire unit list.");
		System.out.println("b: Add a new unit to the list.");
		System.out.println("c: exit the attendance program.");
		String selection = sc.next();

		if (selection.equals("a")) {

			unit.forEach((key, value) -> System.out.println(key + " " + value)); // used google coz i couldn't figure
																					// out what to do.
			main(null);
		} else if (selection.equals("b")) {
			counter++;
			System.out.println("Enter new Student name: ");
			String x = sc.next();
			unit.put(x, counter);
			main(null);

		} else if (selection.equals("c")) {
			System.out.println("Have a good day!");
			System.exit(0);
		} else {
			System.out.println("i didnt understand that. please try again.");
			System.out.println();
			main(null);
		}

	}

}

package Homework;

import java.util.HashMap;

public class Homework2 {

	public static void main(String[] args) {

		HashMap<String, Integer> people = new HashMap<String, Integer>();

		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);

		for (String i : people.keySet()) {
			if (i.length() == 5) {
				System.out.println("key: " + i + " value: " + people.get(i));
			} else {
				System.out.println("n.a.");
			}
		}
	}
}

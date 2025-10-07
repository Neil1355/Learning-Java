package Homework;

import java.util.HashMap;

public class Homework4 {
	public static void main(String[] args) {

		HashMap<String, Double> Course = new HashMap<String, Double>();

		Course.put("Computer Science", 4.0);
		Course.put("College Writing", 4.5);
		Course.put("Calculus-1", 4.0);
		Course.put("Byrne Seminar", 1.0);

		for (String i : Course.keySet()) {
			double x = (Double) Course.get(i);
			if (x>= 4.0) {
				System.out.println("key: " + i + " value: " + Course.get(i));
			} else {
				System.out.println("n.a.");
			}
		}
	}
}

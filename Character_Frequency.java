package Homework;

import java.util.*;

public class Character_Frequency {
	public static void main(String[] args) {
		int[] FrequencyArray = new int[26];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();

		for (char c : word.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				FrequencyArray[c - 'a']++;
			}
		}
		System.out.println("Alphabet\tFrequency");

		for (int i = 0; i < FrequencyArray.length; i++) {
			if (FrequencyArray[i] > 0) {
				char alphabet = (char) ('a' + i);
				System.out.println(alphabet + "\t\t" + FrequencyArray[i]);
			}
		}
		sc.close();
	}
}

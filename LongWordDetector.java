package Homework;

import java.util.*;

public class LongWordDetector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line of text:");
		String line = sc.nextLine();

		char[] charArray = line.toCharArray();

		String currentWord = "";
		String longestWord = "";

		for (char c : charArray) {
			if (Character.isLetterOrDigit(c)) {
				currentWord += c;
			} else {
				if (currentWord.length() > longestWord.length()) {
					longestWord = currentWord;
				}
				currentWord = "";
			}
		}

		if (currentWord.length() > longestWord.length()) {
			longestWord = currentWord;
		}

		System.out.println("Longest word: " + longestWord);
	}
}

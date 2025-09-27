package Homework;

import java.util.*;

public class WordLetterSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("Enter a word: ");
		word = sc.nextLine();

		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		String SortedString = new String(charArray);

		char FirstChar = SortedString.charAt(0);
		char LastChar = SortedString.charAt(SortedString.length() - 1);

		StringBuilder CompleteAlphabet = new StringBuilder();
		for (char CurrentChar = FirstChar; CurrentChar <= LastChar; CurrentChar++) {
			CompleteAlphabet.append(CurrentChar);
		}

		System.out.println("Alphabetical Order: " + SortedString);
		System.out.println("Complete alphabet: " + CompleteAlphabet);
		sc.close();
	}
}
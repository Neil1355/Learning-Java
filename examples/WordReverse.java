package Homework;

import java.util.*;

public class WordReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "Geek", nstr = "";
		char ch;
		System.out.println("Enter a word: ");
		str = sc.nextLine();
		System.out.print("Original word: ");
		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed word: " + nstr);
	}
}

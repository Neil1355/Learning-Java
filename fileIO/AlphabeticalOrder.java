package Homework;

import java.util.*;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        String str = "This is the last question of the test paper";

        List<String> words = Arrays.asList(str.split(" "));

        Collections.sort(words);

        System.out.println("Words in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

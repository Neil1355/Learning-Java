package Homework;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 5) {
                        writer.write(word);
                        writer.newLine();
                    }
                }
            }
            
            System.out.println("Words longer than 5 characters have been written to " + outputFile);
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

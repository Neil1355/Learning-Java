package Homework;

import java.util.Scanner;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Amount must be greater than zero.");
            }
            System.out.println("Amount is valid.");
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

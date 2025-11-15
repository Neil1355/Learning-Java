import java.util.Scanner;

public class Bank {
	private String name;
	private double balance, value, deposit;
	private long accountNumber, number;
	private static final Scanner SC = new Scanner(System.in);

	public void deposit() {
		System.out.println("Enter the amount to be deposited: ");
		if (SC.hasNextDouble()) {
			deposit = SC.nextDouble();
			balance = balance + deposit;
			System.out.println("Deposited: " + deposit + ", current balance: " + balance);
		} else {
			System.out.println("No deposit amount provided.");
		}
	}

	public void withdraw() {
		System.out.println("enter the amount to be withdrawn:");
		if (SC.hasNextDouble()) {
			value = SC.nextDouble();
			balance = balance - value;
			System.out.println("current balance in your account is: " + balance);
		} else {
			System.out.println("No withdrawal amount provided.");
		}
	}

	public void OpenAccount() {
		System.out.println("enter your name, number, and initial deposit: ");
		if (SC.hasNext()) name = SC.next();
		if (SC.hasNextLong()) number = SC.nextLong();
		if (SC.hasNextDouble()) balance = SC.nextDouble();
		System.out.println("choose your 10-digit account number : ");
		if (SC.hasNextLong()) accountNumber = SC.nextLong();
		System.out.println("so your account details will be as listed below:" + name + " " + number + " " + balance + " " + accountNumber);
	}

	public static void main(String args[]) {
		Bank obj = new Bank();
		obj.OpenAccount();
		obj.deposit();
		obj.withdraw();
	}
}

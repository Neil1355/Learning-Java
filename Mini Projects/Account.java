import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;

public class Account {
	private String accountNo;
	private String name;
	protected double balance;
	protected List<Transaction> transactions = new ArrayList<Transaction>();

	static final String KIND = "Normal";
	static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
	static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	static final String DEPOSIT = "Deposit";
	static final String WITHDRAW = "Withdrawal";
	static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();

	
  public Account(String accountNo, String name) {
    this.accountNo = accountNo;
    this.name = name;
  }
	
    
  public Account(String accountNo, String name, double balance) {
    this.accountNo = accountNo;
    this.name = name;
    this.balance = balance;
  }
  

	public Account() {
	
}


	public void deposit(double amount) {
		balance = balance + amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(DEPOSIT);
		transactions.add(transaction);
	}

	public void withdraw(double amount) {
		if (amount > this.balance) {
			return;
		}
		balance = balance - amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(WITHDRAW);
		transactions.add(transaction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getKind() {
		return KIND;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(accountNo);
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(NUMBER_FORMAT.format(balance));
		sb.append("|");
		sb.append(getKind());

		return sb.toString();
	}

	public static void main(String[] args) {
		Account obj = new Account();
		obj.deposit(0);
		obj.withdraw(0);
		obj.getName();
		obj.setName(DEPOSIT);
		obj.getAccountNo();
		obj.setAccountNo(DEPOSIT);
		obj.getBalance();
		obj.setBalance(0);
		obj.getTransactions();
		obj.setTransactions(null);

	}
}
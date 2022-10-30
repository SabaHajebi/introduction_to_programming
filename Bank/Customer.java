import java.util.Date;

public class Customer {
	private String name;
	private String address;
	private Date DOB;
	private int accountNum;
	private double balance;
	private int[] transactions;


	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}
	
	public Date setDate(Date DOB) {
		return this.DOB = DOB;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String setAddress(String address) {
		return this.address = address;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public int getAccountNum(int accountNum) {
		return this.accountNum = accountNum;
	}

	public int[] getTransactions() {
		return transactions;
	}

	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}
	
}

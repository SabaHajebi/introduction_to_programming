import java.util.Date;

public class Transaction {
	private String type;
	private Date date;
	private double amount;

	public String getType() {
		return type;
	}
	
	public String setType(String type) {
		return this.type = type;
	}

	public Date getDate() {
		return date;
	}
	
	public Date setDate(Date date) {
		return this.date = date;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double setAmount(double amount) {
		return this.amount = amount;
	}



}

package banking;

import java.util.Date;
import java.sql.Timestamp;

/**
 * 
 * @author Administrator
 *
 */
public class Account{
	private long aid;
	protected String accountNum;
	protected double balance;
	private char accountType;
	protected Customer customer; //account가 customer를 참조한다.
	protected long customerId;
	protected Date regDate;
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date date) {
		this.regDate = date;
	}

	public Account(String accountNum2, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAid(long long1) {
		// TODO Auto-generated method stub
		
	}

	public void setAccountType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return accountNum + balance + accountType + customerId + regDate;
	}
}

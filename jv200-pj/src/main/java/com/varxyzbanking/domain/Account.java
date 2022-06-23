package com.varxyzbanking.domain;
/**
 * 2*5*7 sorry,sir
 * @author Administrator
 *
 */
public abstract class Account{
	protected String accountNum;
	protected double balance;
	protected Customer customer; //account가 customer를 참조한다.
	
	public Account(String accountNum2, double balance2) {
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
	
	
}

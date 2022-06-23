package com.varxyzbanking.domain;

public class SavingsAccount extends Account {
	private static final double DEFALUT_INTERER_RATE = 0.03;
	private double interestRate;
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFALUT_INTERER_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			//예외발생
			throw new InsufficientBalanceException("잔고부족");
		}
		super.balance -= amount;
	}
}

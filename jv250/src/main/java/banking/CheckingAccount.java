package banking;

public class CheckingAccount extends Account{
	private double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if(balance < amount) {
			//잔고부족시 overdraftAmount 금액을 한도 내에서 추가 출금을 승인
			try {
				balance -= overdraftAmount - amount;
			}catch (OverChargeException oce) {
				System.out.println("잔고부족");
			}
		}else {
			balance = balance - amount;
		}
	}

	public String getOverdraftAmont() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOverdraftAmount(double double1) {
		// TODO Auto-generated method stub
		
	}
}

package banking;

import java.sql.*;
import java.util.Date;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("888-88-8888");
		sa.setBalance(2000.0);
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('C');
		sa.setCustomer(new Customer(1003));
		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("901212-1234567")) {
			System.out.println(account);
		}
	}
}

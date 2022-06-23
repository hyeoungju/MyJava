package banking;

import java.util.Collection;
import java.util.List;

public interface AccountService {
	void addCount(Account account);
	void addCount(Account account, String ssn);
	List<Account> getAccountBySsn(String ssn);
	Account getAccountByAccountNum(String accountNum);
	Collection<Account> getAllAccounts();
	int getNumOfAccounts();
}

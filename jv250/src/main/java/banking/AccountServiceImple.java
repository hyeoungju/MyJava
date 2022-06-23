package banking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImple implements AccountService {
	private static AccountService service = new AccountServiceImple(); //싱글톤
	private List<Account> accountList = new ArrayList<Account>(); //DB 대신 임시로해놓은것
	private CustomerService customerService;
	
	
	public AccountServiceImple() { //customerService 싱글톤?
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() { //싱글톤
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interstRate) {
		return new SavingsAccount(accountNum, balance, interstRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	/**
	 * 신규 계좌 등록
	 * @param account      계좌정보와 고객정보 전체를 캡슐화
	 */
	public void addAccount(Account account) { //고객정보가 다 차있다고 생각했을때 가져오는 메소드
		accountList.add(account);
	}
	
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등
	 * @param account
	 * @param ssn
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) { //ssn을 통해 고객정보를 가져오기
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		return null;
	}

	@Override
	public void addCount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCount(Account account, String ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumOfAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}
}

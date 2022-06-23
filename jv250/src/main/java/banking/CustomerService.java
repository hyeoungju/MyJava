package banking;

import java.util.Collection;
import java.util.List;


public interface CustomerService { // 홈플러스 매장에 고객이 카트를 들고 들어와서 마주하는 매니저가 바로 서비스인 것이다. 
		void addCustomer(Customer customer);
		Customer getCustomerBySsn(String ssn);
		Collection<Customer> getAllCustomers();
		int getNumOfCustomer();
}

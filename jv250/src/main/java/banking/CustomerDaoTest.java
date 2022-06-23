package banking;

import java.util.List;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		//finaAllCustomers() Test
		List<Customer> customerList = dao.findAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer.toString());
			
		}
		System.out.println("------------------------------------");
		
		
		//findCustomerBySsn
		Customer customer = dao.findCustomerBySsn("9012121-1234567");
		System.out.println(customer);
		System.out.println("-----------------------------------------");
		
		//addCustomer
		Customer c = new Customer();
		c.setName("공명");
		c.setSsn("970710-1234567");
		c.setPhone("010-6358-4515");
		c.setCustomerId("spring");
		c.setPasswd("2222");
		
		dao.addCustomer(c);
	}
	
}

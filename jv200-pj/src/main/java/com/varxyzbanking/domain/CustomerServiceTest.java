package com.varxyzbanking.domain;

public class CustomerServiceTest {
	public static void main(String[] args) {
		CustomerService custo = new CustomerServiceImpl();
		Customer nam = new Customer();
		nam.setName("nam");
		nam.setSsn("123456-123456");
		custo.addCustomer(nam);
		System.out.println(custo.getCustomerBySsn("123456-123456"));
	}
}

package com.varxyzbanking.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	private static CustomerService service = new CustomerServiceImpl(); //customer 객체생성
	private List<Customer> customerList = new ArrayList<>();
	
	CustomerServiceImpl() {
		super();
	}
	
	public static CustomerService getInstance() { //instnace 생성
		return service;
	}
	
	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null) {
			customerList.add(customer);
			System.out.println("등록성공");
		}
	}
	
	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList ) {
			if(ssn.equals(c.getSsn())) {
				System.out.println(c.getName());
				return c;
			}
		}
		return null;
	}
	
	public Collection<Customer> getAllCustomers() {
		return customerList;
	}
	
	@Override
	public int getNumOfCustomer() {
		return customerList.size();
	}
	
}
package com.varxyzbanking.domain;

import java.util.ArrayList;

public class Customer {
	private String name;
	private String ssn;
	private String phone;
	private String customerId;
	private String passwd;
	
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	ArrayList<String> account = new ArrayList<String>();
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
//	public Customer(String name, String ssn, String phone, String customerId, String passwd,
//			ArrayList<String> account) {
//		super();
//		this.name = name;
//		this.ssn = ssn;
//		this.phone = phone;
//		this.customerId = customerId;
//		this.passwd = passwd;
//		this.account = account;
//	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getAccount() {
		return account;
	}
	
	public void setAccount(ArrayList<String> account) {
		this.account = account;
	}
	
	
}

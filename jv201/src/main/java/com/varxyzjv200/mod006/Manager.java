package com.varxyzjv200.mod006;

public class Manager extends Employee {
	public String department;
	
	//method overriding
	public String getDetails() {
		return super.getDetails() + "\nDepartment:" + department;
	}
}

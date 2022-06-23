package com.varxyzjv200.mod002;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day  = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//this 설명하는 예제. 굳이 안만들어도되는 클래스였지
	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public String toString() {
		return "day="+day + ", month="+month + ", year="+year;
	}

}

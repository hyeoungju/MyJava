package jv2001.mod007;

public class Airplane implements Flyer, Vehicle{

	public void fly() {
		System.out.println("비행기 : 날기");
	}

	public void takeOff() {
		System.out.println("비행기 : 이륙하기");
	}

	public void land() {
		System.out.println("비행기 : 착륙하기");
	}
	
}

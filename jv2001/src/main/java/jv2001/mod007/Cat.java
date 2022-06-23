package jv2001.mod007;

public class Cat extends Animal{

	@Override
	public void makeSound() { //추상메소드를 꼭 구현해야한다.
		System.out.println("야옹");
	}
}

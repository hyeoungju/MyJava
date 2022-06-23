package jv2001.mod007;
/**
 * abstract 메소드의 집합, 상수(public)
 * 인스턴스 생성 불가
 * 다중 상속 지원
 * @author Administrator
 *
 */
public interface Flyer {
	public void fly(); //interface 에서는 기본적으로 public 이고, abstract이기 때문에 안쓴다. public은 생략?
	public void takeOff();
	public void land();
}

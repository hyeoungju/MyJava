package mod009;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");
		set.add(new Integer(4));
		System.out.println(set);
		//equals 메소드가 java class 에 overriding 되어있어서 중복되어져서 결과가 안나온다.
	}
}

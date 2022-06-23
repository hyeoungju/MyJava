package mod009;

import java.util.ArrayList;

public class ListExample2 {
	public static void main(String[] args) {
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("one");
		list2.add("second");
		list2.add("third");
		System.out.println(list2); //generics 써보기
		
		//generics 꺼내기?
		for(String s: list2) {
			System.out.println(s + " ");
		}
	}
}

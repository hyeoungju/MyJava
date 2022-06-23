package mod009;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(new Integer(1), "유비");
//		map.put(new Integer(2), "관우");
//		map.put(new Integer(3), "장비"); //노란딱지 붙는다. 버전이 바껴서? 그럼 어떻게 하냐..api 를 보자
		
		map.put(Integer.valueOf(1), "유비");
		map.put(2, "관우"); //2 대신에 object 가 들어가야하지만 그래서, 문법적으로는 틀린 거지만 auto boxing 을 해줘서 괜찮다.
		map.put(new Integer(3), "장비");
		
		System.out.println(map.get(new Integer(1)));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}
}

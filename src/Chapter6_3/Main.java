package Chapter6_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, null);
		map.put(3, 30);

		// 使用されるマージ関数は、既存の値がnullでない場合には a + b を、nullの場合には b を返すものです。
		map.merge(1, 3, (a, b) -> a + b);
		map.merge(3, 3, (a, b) -> a + b);

		System.out.println(map);
	}
}

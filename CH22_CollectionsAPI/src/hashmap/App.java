package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 key, value값을 입력
		HashMap<Integer, String> people = new HashMap<>();
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); // 키값은 중복되지 않는다. 똑같은 키값이면 업데이트
		people.put(10, "수지");

		people.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println();

		System.out.println(people.get(4)); // 키 4에 해당하는 value값을 가져옴
	}

}

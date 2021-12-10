package javaAPI;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, String> emails = new HashMap<>();
		
		emails.put("홍팍", "sehong@cloudstudying.kr");
		emails.put("나리", "nari@cloudstudying.kr");
		emails.put("정애", "jungae@cloudstudying.kr");
		
		System.out.printf("emails.size() -> %d\n", emails.size());
		
		System.out.println("\n== key set ==");
		for(String key : emails.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("\n== value ==");
		for(String val : emails.values()) {
			System.out.println(val);
		}
	}

}

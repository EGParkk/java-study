package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// predicate를 사용
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 입력된 타입의 객체를 검사해서 참/거짓으로 리턴
				return t.length() < 4;
			}
		};
		
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));
		
		Predicate<String> p2 = t -> t.length() < 4;
		
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘"));
	}

}

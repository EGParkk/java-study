package arrayList;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		// Person 클래스 타입 ArrayList
		ArrayList<Person> people = new ArrayList<>();
		
		// 1. 객체를 생성하고 입력
		Person p1 = new Person("펭수");
		Person p2 = new Person("길동");
		
		people.add(p1);
		people.add(p2);
		
		// 2. 생성과 동시에 입력
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		people.forEach(System.out::println);
	}

}

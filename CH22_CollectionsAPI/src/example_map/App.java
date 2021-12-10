package example_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person>{
	// Person의 이름으로 equals 메소드를 만들어 key값의 중복을 이름으로 하도록한다.
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// 이름으로 비교
	}
}

public class App {

	public static void main(String[] args) {
		// 맵을 사용한 예제
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		// 맵에서 키값으로 중복을 결정하는데 Person클래스에서 equals 메소드를 만들어 이름이 같으면 중복이 되게 수정
		inputMap(people1);
		displayMap(people1);
		
		inputMap(people2);
		displayMap(people2);
		
		// 트리맵은 정렬하는데 이때 키값인 Person 클래스에서 Comparable 인터페이스를 구현해야 된다.
		inputMap(people3);
		displayMap(people3);
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵의 key와 value값을 출력한다.
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println(); // 한줄 뛰우기
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// 맵에 Person객체와 boolean(원격 여부)을 입력
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false); // 똑같은 이름은 중복 안됨
		map.put(new Person("둘리"), true); // 둘리의 value값이 true로 업데이트 됨
	}

}

package tree_Set;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	
	public Person (String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// 이름을 문자열로 비교(이미 문자열에 비교 메서드 compareTO가 구현되어 있음)
	}
}

public class App {

	public static void main(String[] args) {
		// 트리셋은 정렬 기능 추가 (반드시 Comparable 인터페이스를 구현한 클래스 객체 입력)
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(7);
		numbers.add(3);
		numbers.add(9);
		numbers.add(1);
		
		numbers.forEach(System.out::println);
	}

}

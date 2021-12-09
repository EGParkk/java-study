package equals;

import java.util.Objects;

class Person{
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
		if (this == obj) // 객체가 같을 경우
			return true;
		if (obj == null) // 비교 대상이 널값인(없을) 경우
			return false;
		if (getClass() != obj.getClass()) // 클래스 타입이 다를 경우
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name); // 위의 3가지 경우가 아닐 경우에 이름으로 비교한다.
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}

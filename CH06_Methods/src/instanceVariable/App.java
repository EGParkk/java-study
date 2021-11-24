package instanceVariable;

public class App {

	public static void main(String[] args) {
		// 같은 패키지 안에 있는 Person 클래스를 사용한다.
		// 스캐너를 사용할려면 스캐너 클래스를 import 해야함
		Person p1 = new Person();
		p1.name = "펭수";
		p1.age = 7;
		Person p2 = new Person();
		p2.name = "길동";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		//Person.name = "홍길동"; 사용불가
	}

}

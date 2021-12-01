package default_Constructor;

public class App {

	public static void main(String[] args) {
		// 디폴트 생성자
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person("펭수");
		System.out.println(p2);
		
		Person p3 = new Person("라이언", 5);
		System.out.println(p3);
	
	}

}

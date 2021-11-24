package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스터스 변수에 접근하는 메소드 get 과 set
		Person p1 = new Person();
		// 보안상 객체의 변수에 바로 접근하지 않음
		// p1.name = "펭수";
		p1.setName("펭수");
		p1.setAge(7);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setAge(17);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}

}

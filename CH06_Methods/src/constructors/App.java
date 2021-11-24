package constructors;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		// 기본생성자는 생략가능
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setHeight(120.0);
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setHeight(172.5);
		
		Person p3 = new Person();
		// p3.setName("라이언");
		// p3.setHeight(165.5);
		
		System.out.printf("이름 : %s, 키 : %.1f \n", p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n", p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s, 키 : %.1f \n", p3.getName(), p3.getHeight());
	}

}

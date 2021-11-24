package method;

public class Person {
	// 클래스 안의 일반 변수 = 인스턴스 변수(객체 생성 시 생성됨)
	String name;
	int age;
	
	// 클래스 안에 만든 함수를 메소드 => 객체 생성 시 사용가능
	void sayHello() {
		System.out.println("헬로우! " + name);
	}
}

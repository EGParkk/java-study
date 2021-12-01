package multi_Interface;

interface Speaker{
	void speak();
}

interface Greeter{
	void greet();
}

public class App {

	public static void main(String[] args) {
		// 인터페이스는 다중 구현이 가능
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person(); // Person이 구현한 인터페이스 Speaker로 선언
		p2.speak();
		// p2.greet(); Speaker 인터페이스의 추상 메소드만 사용가능
		
		Greeter p3 = new Person();
		p3.greet();
		// p3.speak(); Greeter 인터페이스의 추상 메소드만 사용가능
	}

}

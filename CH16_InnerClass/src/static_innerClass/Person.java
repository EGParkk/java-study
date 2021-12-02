package static_innerClass;

public class Person {
	class Head{
		public void print() {
			System.out.println("헤드");
		}
	}
	
	static class Body{
		public void print() {
			System.out.println("바디");
		}
	}
	
	public void print() {
		// 내부 클래스는 클래스 안에서 객체를 만들어 사용하면 쉽게 사용
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}
}

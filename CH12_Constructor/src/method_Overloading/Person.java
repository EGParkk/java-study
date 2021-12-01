package method_Overloading;

public class Person {
	// 이름이 같은 그리트 메소드가 여러개
	// 매개변수가 다르면 다른 메소드
	public void greet() {
		System.out.println("헬로우!");
	}
	
	public void greet(String name) {
		System.out.println("헬로우! " + name);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("키가 크군요!");
		}
		else {
			System.out.println("헬로우~~");
		}
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("키가 크군요!");
		}
		else {
			System.out.println("헬로우~~" + name);
		}
	}
}
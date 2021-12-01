package super_Constructor;

public class Employee extends Person {
	public Employee() {
		super("익명"); // 부모클래스의 생성자
		System.out.println("Employee 생성자");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}

package getterSetter;

public class Person {
	// private는 같은 클래스에서만 접근 가능
	private String name;
	private int age;
	
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		System.out.println(this);
		this.name = name; // 이때 this.name은 인스턴스의미
	}
	
	public void setAge(int age) {
		System.out.println(this);
		this.age = age;
	}
	
	// get은 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

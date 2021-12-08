package hierarchy;

public class Creature {
	// 필드 변수, 인스턴스 변수
	private String name;
	
	// 생성자
	public Creature(String name) {
		this.name = name;
	}
	
	// toString 메소드 (객체변수 출력시 실행(생략))
	public String toString() {
		return name;
	}
	
	// feed 메소드
	public void feed() {
		System.out.println("먹는다...");
	}
}

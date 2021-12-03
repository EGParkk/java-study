package enum_Constructor;

public enum Fruit { // keyword가 enum
	APPLE("초록색"), BANANA("노란색"), ORANGE("주황색");	// 상수들의 집합 (0, 1, 2 인덱스 번호)
	
	private String color;
	
	Fruit(String color) { // enum의 생성자
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+" ("+color+")";
	}
}

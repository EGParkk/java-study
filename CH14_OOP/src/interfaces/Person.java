package interfaces;

// 인터페이스를 구현(상속)할떄 implements 사용, 상속한 클래스엣 추상메소드 완성(구현)
public class Person implements Describable {

	@Override
	public String getDescString() {
		return "사람 입니다.";
	}

}

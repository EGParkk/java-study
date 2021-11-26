package overridingMethod;

public class HouseCat extends Cat {
	@Override
	public void vocal() { // 오버라이딩 메소드 : 자식 클래스에서 부모와 똑같은 메소드를 만듬
		System.out.println("미야우~");
	}
}

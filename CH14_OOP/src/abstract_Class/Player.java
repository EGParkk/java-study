package abstract_Class;

// 추상 클래스를 상속 받았을 경우 추상 메소드를 구현해야 됨
public class Player extends GameObject {

	@Override
	public void describe() {
		// 추상 클래스의 추상 메소드 describe()를 완성 시킨다.
		System.out.println("플레이어 입니다.");		
	}

}

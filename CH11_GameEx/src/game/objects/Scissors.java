package game.objects;

// 가위, 게임오브젝트 상속
public class Scissors extends GameObject {
	// 가위 바위 보 0 1 2 (아이디)
	public Scissors() {
		setId(0); // 아이디를 0으로
		setName("가위");
	}
}

package inheritance;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메소드 eat()
		Animal ani = new Animal();
		ani.eat();
		
		// 새 클래스는 메소드 fly()
		Bird bird = new Bird();
		bird.eat(); // 상속 받음
		bird.fly();
	}

}

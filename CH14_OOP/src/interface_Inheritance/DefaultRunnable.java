package interface_inheritance;

// 인터페이스 끼리 상속가능
public interface DefaultRunnable extends Runnable {
	default public void displayDetails() { // 디폴트 메소드는 구현 가능
		System.out.println("표시할 디테일 없음");
	}
}

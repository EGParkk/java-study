package exception_example;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// 자바 예외
		System.out.println("하나");
		Thread.sleep(2000); // 2초 대기 => 예외처리 해야 함
		System.out.println("둘");
	}

}

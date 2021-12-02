package interface_Inheritance;

public class App {

	public static void main(String[] args) {
		// 인터페이스는 인터페이스를 상속
		DefaultRunnable m1 = new Machine();
		m1.run();
		m1.displayDetails();
	}

}

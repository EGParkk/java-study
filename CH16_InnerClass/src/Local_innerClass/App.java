package Local_innerClass;

public class App {
	private String name; // 인스턴스 변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		// System.out.println(name); 사용불가
		App app = new App();
		// app.name = "펭수";
		app.run();
	}
	
	private void run() {
		// 클래스 안의 메소드에 클래스
		class Printer{
			public void print() {
				System.out.println(name); // 내부 클래스는 상위 클래스의 변수를 사용 가능
			}
		}
		
		new Printer().print();
	}
}

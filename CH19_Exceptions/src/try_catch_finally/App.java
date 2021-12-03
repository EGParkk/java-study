package try_catch_finally;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		try {
			p1.setName(null);
			System.out.println("예외 발생 시 여기는 실행 안됨");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 여기는 예외가 발생 하든 안하든 무조건 실행 됨
			System.out.println("finally 무조건 실행");
		}
		
		System.out.println("프로그램 종료");
	}

}

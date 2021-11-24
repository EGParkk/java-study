package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set 메소드로 값을 입력하고 get메소드로 값을 출력
		// 설정 윈도우창의 가로길이 300, 세로길이 600
		// 현재 보이도록 true, top200, left400
		
		Window window = new Window();
		
		window.setWidth(300);
		window.setHeight(600);
		window.setVisible(true);		
		window.setTop(200);
		window.setLeft(400);
		
		System.out.println(window.getWidth());
		System.out.println(window.getHeight());
		System.out.println(window.getVisible());
		System.out.println(window.getTop());
		System.out.println(window.getLeft());
	}

}

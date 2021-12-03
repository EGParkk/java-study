package application;

import game.Game;

public class App {

	public static void main(String[] args) {
		// 여기부터 프로그램 시작
//		Game game = new Game(); // 클래스 불러올때 ctrl + 스페이스, ctrl + shift + o (여러개를 한꺼번에)
//		game.run();
		
		new Game().run();
	}

}
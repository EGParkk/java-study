package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true; // 게임을 계속 진행?
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord(); // 화면에 단어 표시
			getUserInput(); // 철자 하나를 입력 받음
			checkUserInput(); // 맞는지 체크 (전부 맞으면 running = false)			
		}while(running);
	}

	private void displayWord() {
		System.out.println(word.toString());
	}
	
	private void getUserInput() {
		// 유저에게 한 문자 입력 요규
		// 입력 받은 문자열에서 한 문자를 뽑아서
		// RandomWord 객체에 전달 (addGuess(문자) 메소드를 만들자)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력 받은 문자열을 guess에 저장
		// 단어에서 입력 받은 문자가 있는지 확인해서 처리한다. (단어는 RandomWord 객체 word를 사용)
		word.addGuess(guess.charAt(0));
	}
	
	private void checkUserInput() {
		// 유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		// 게임 종료 확인을 하는 메소드 isCompleted를 RandonWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞춰어요!");
			System.out.println("정답은 : " + word.toString());
			running = false;
		}
	}
	
	/**
	 *  스캐너 닫는 메소드
	 */
	public void close() {
		scanner.close();
	}
}

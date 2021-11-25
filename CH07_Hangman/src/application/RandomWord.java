package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 뛰어진 단어들을 문자열로 str에 저장
	private String str = "personality marketing investment difference reputation decision complaint resource homework football championship preparation engineering university government consequence property definition transportation establishment community hospital president solution association committee departure teaching apartment performance information confusion location response connection suggestion perspective contribution significance population boyfriend importance television intention refrigerator communication application distribution philosophy guidance";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 입력
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)
	private Random random = new Random();
	
	public RandomWord() {
		// 생성자에서 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()]; // 선택 단어의 길이만큼 문자배열 생성
	}
	
	public void getWords() { // 현재 words 배열에 있는 전체 단어를 출력
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		// 단어를 _로 출력한다.
		// String text = "";
		StringBuilder sb = new StringBuilder();
		// characters[3] = 'X'; // 테스트
		for(char c : characters) {
			sb.append(c == '\u0000' ? '_' : c); // 못맞추면 _, 맞추면 c
			sb.append(" ");
		}
		// System.out.println(selectWord); // 정답 출력(테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i = 0; i < selectWord.length(); i++) { // 선택 단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
}

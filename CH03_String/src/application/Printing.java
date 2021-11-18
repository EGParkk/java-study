package application;

public class Printing {

	public static void main(String[] args) {
		// 문자열 (+), 출력
		String name = "홍길동";
		System.out.println("내 이름은 " + name); // 문자열 끼리 + 로 더한다.
		
		String text = "나의 이름은 : ";
		String endOfSentence = ".";
		
		System.out.println(text + name + endOfSentence);
	}

}

package application;

public class StringEqual {

	public static void main(String[] args) {
		// 두개의 문자열이 같은지 비교한다.
		String t1 = "사과";
		String t2 = "사과";
		
		System.out.printf("두개의 문자열 일치 : %b \n", t1 == t2);
		System.out.printf("두개의 문자열 일치 : %b \n", t1.equals(t2)); // 문자열이 같으면 true, 아니면 false
	}

}

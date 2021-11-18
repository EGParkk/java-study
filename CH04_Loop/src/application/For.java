package application;

public class For {

	public static void main(String[] args) {
		// for 반복분 for(초기값;조건;증감){명령문;}
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("i : " + i);
//		}
//		for (;;) { // 무한 반복
//			System.out.println("헬로우");
//		}

		// 1 ~ 100까지 합을 for문을 사용하여 출력
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1에서 100까지의 합 : " + sum);
	}

}
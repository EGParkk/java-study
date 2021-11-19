package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열
		String[][] texts = { 
				{ "하나", "둘", "셋" }, 
				{ "넷", "다섯", "여섯" }, 
				{ "일골", "여덟", "아홉" } 
		};

		for (int i = 0; i < texts.length; i++) { // 이중 배열의 length는 내부 배열의 개수
			// System.out.printf("%d번 배열 %s \n", i, texts[i]);
			// String[] inArray = texts[i];

			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s \t", texts[i][j]);
			}

			System.out.println();
		}
	}

}

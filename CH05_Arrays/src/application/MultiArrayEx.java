package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		// 이중 배열 예제 모든 정수 값의 합계를 구하라.
		int[][] value = {
				{1, 5, 7},
				{9, 6, 3, 10},
				{2, 4, 6}
		};
		
		int total = 0;
		
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				total += value[i][j];
			}
		}

		System.out.println("총 합은 : " + total);
	}

}

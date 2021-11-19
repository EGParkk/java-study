package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성한다.
		// int[] n = {1, 2, 3}; 초기값을 바로 넣는 법 리터럴이라고 한다.
		int[] numbers; // 정수형 배열 numbers 선언
		numbers = new int[3]; // 실제 정수형 3개의 배열을 만듬
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			numbers[i] = scanner.nextInt();
			total += numbers[i]; // 모든 배열의 값을 더함
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		scanner.close();
		System.out.println("총 합계는 : " + total);
	}

}

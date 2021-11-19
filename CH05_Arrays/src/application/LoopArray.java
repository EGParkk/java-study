package application;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		
		String[] animals = {"고양이", "개", "펭귄", "사자", "돌고래", "하마", "호랑이"};
		
		/*
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		 */

		for (int i = 0; i < animals.length; i++) {
			// System.out.println(animals[i]);
			System.out.printf("인덱스 %d번은 %s이다. \n", i, animals[i]);
		}
	}

}

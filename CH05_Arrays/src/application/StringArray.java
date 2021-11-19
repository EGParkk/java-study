package application;

public class StringArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		
		String[] animals = {"고양이", "개", "펭귄", "사자"};
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		// 배열 안의 값을 바꾸는 방법
		animals[0] = "닭";
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
	}

}

package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감 연산자 ++, -- 위치가 다른 경우
		// 뒤에 있을 경우 먼저 사용하고 증감, 앞에 있을 경우 먼저 증감하고 사용
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		
		int sum = x + z++;
		
		System.out.println(sum);
		
		int apples = 5;
		int banana = 4;
		
		int fruits = ++apples + banana++;
		
		System.out.println(fruits);
	}

}

package hashset;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// 링크드헤시셋 타입은 중복이 안되고 순서대로 출력됨
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}

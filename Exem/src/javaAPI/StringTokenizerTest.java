package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이, 탕수육";
		
		StringTokenizer token = new StringTokenizer(str, ", ");
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

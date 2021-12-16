package operators;

public class SHIF {

	public static void main(String[] args) {
		// 비트 shift >>, << 연산
		int value = 0b00010001;
		System.out.println(toBinary(value));
		
		int result1 = value << 3;
		System.out.println(toBinary(result1));
		
		int result2 = result1 >> 3;
		System.out.println(toBinary(result2));
		
		System.out.println(100 << 3); // 값이 곱하기 2^n 즉 2*2*2
		System.out.println(100 >> 2); // 값이 나누기 2^n 즉 2*2
		
	}
	
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴된다.
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}

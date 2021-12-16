package operators;

public class XOR_NOT {

	public static void main(String[] args) {
		// 비트 XOR, NOT 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2; // XOR 비트 연산 : 같으면 0, 다르면 1
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		
		System.out.println();
		
		System.out.println(toBinary(~result1 & 0x00FF));
	}
	
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴된다.
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}

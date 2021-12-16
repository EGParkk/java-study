package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수		deciaml (0 - 9)
		 * 2진수		binary (0 - 1)
		 * 16진수		hexadecimal (0 - F)
		 * 
		 * 0123456789
		 * 01
		 * 0123456789ABCDEF
		 */
		
		// 리터럴(값) 표시 16진수 0xXX, 2진수 0bXXXXXXX
		int val = 0b11111111;
		
		System.out.println("10진수 : " + val);
		System.out.println(" 2진수 : " + Integer.toBinaryString(val));	// 10진수 정수를 => 2진수로 표현
		System.out.println("16진수 : " + Integer.toHexString(val));		// 10진수 정수를 => 16진수로 표현
		
	}

}

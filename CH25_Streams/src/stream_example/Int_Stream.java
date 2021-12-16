package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// 정수형 스트림 생성
		IntStream
			.range(1, 10)	// 1에서 (10-1)까지 정수
			.skip(5)		// 5개 정수 스킵(넘김)
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val = IntStream.range(1, 101).sum(); // 1부터 100까지 정수의 합
		System.out.println(val);
	}

}

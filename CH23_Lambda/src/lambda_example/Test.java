package lambda_example;

// 람다식을 쓸려면 functional interface
@FunctionalInterface
public interface Test {
	void run(); // 추상 메소드 런을 생성
	// void run2(); // 함수형 인터페이스는 하나의 추상 메소드만 가질 수 있음
}

package custom_exception.exceptions;

// Exeption을 상속 받아서 새 예외 클래스를 만든다
public class TempOutOfRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {
		super(message); // 입력된 메세지로 새 예외 객체 생성
	}
}

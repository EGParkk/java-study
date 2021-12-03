package custom_exception.exceptions;

public class TempTooLowException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;

	public TempTooLowException(String message) {
		super(message);
	}
}

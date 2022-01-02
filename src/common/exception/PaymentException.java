package common.exception;

/**
 * This exception is thrown when there is error related to payment process
 */
@SuppressWarnings("serial")
public class PaymentException extends RuntimeException {
	/**
	 * Exception Construction
	 * @param message
	 */
	public PaymentException(String message) {
		super(message);
	}
}

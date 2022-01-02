package common.exception;

/**
 * This exception is thrown when the card info is invalid
 */

@SuppressWarnings("serial")
public class InvalidCardException extends PaymentException {
	/**
	  * Exception Construction
	  */
    public InvalidCardException() {
        super("ERROR: Invalid card!");
    }

    /**
	  * Exception Construction
	  */
    public InvalidCardException(String message) {
        super(message);

    }
}

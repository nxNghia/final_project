package common.exception;;
/**
 * This exception is thrown when the transaction is suspicious
 */
@SuppressWarnings("serial")
public class SuspiciousTransactionException extends PaymentException {
	/**
	 * Exception Construction
	 */
	public SuspiciousTransactionException() {
		super("ERROR: Suspicious Transaction Report!");
	}
}

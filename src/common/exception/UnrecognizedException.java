package common.exception;;
/**
 * this exception is thrown when there is error but the cause is unknown
 */
@SuppressWarnings("serial")
public class UnrecognizedException extends RuntimeException {
	/**
	  * Exception Construction
	  */
	public UnrecognizedException() {
		super("ERROR: Something went wrong!");
	}
}

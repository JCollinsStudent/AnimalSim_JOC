/**
 * InvalidSimIDException defines an exception that occurs
 * when an inputted SimID is less than 0.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 */
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException{
	public InvalidSimIDException(String message) {
		super(message);
	}
}

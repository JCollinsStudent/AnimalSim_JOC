/**
 * InvalidWingspanException defines an exception that occurs
 * when an inputted Wingspan value is less than 5.0 or greater than 11.0
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 */
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException{
	public InvalidWingspanException(String message) {
		super(message);
	}
}

/**
 * InvalidCoordinateException defines an exception that occurs
 * when an inputted SubSpecies is not equal to one of the
 * specified Strings.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 */
@SuppressWarnings("serial")
public class InvalidSubspeciesException extends RuntimeException{
	public InvalidSubspeciesException(String message) {
		super(message);
	}
}

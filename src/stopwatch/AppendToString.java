package stopwatch;

/**
 * Task that append chars to a string.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class AppendToString implements Runnable {
	private int size;
	private String result;

	/**
	 * Constructor initializes the AppendToString with a specific size
	 * 
	 * @param size
	 *            is a length of final string
	 */
	public AppendToString(int size) {
		this.size = size;
	}

	/**
	 * Add char 'a' in to String until it final size
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		result = "";
		int k = 0;
		while (k++ < size) {
			result = result + CHAR;
		}
	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 * 
	 */
	@Override
	public String toString() {
		return String.format(
				"Append %,d chars to String\nfinal string length = %d", size,
				result.length());
	}

}

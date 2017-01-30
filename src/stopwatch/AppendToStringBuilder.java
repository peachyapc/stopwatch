package stopwatch;

/**
 * Task append chars to a StringBuilder
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int size;
	private String result;

	/**
	 * Constructor initializes the AppendToStringBuilder with a specific size.
	 * 
	 * @param size
	 *            is a length of final string
	 */
	public AppendToStringBuilder(int size) {
		this.size = size;

	}

	/**
	 * Add char 'a' in to StringBuilder until it final size.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		this.result = "";
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < size) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
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
				"Append %,d chars to StringBuilder\nfinal string length = %d",
				size, result.length());
	}

}

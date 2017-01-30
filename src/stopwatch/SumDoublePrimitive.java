package stopwatch;

/**
 * Task add double primitives from an array.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class SumDoublePrimitive implements Runnable {

	// use to measure how many time you want to add a number.
	private int counter;
	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	private static final int ARRAY_SIZE = 500000;
	// sum to add all the number
	private double sum;

	/**
	 * Constructor initializes the SumDoublePrimitive with a counter.
	 * 
	 * @param counter
	 *            use to measure how many time you want to add a number.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number from 1 until to the ARRAY_SIZE by using primitive double
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
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
				"Sum array of double primitives with count = %,d\n", counter)
				+ "sum = " + sum;
	}

}

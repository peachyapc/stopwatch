package stopwatch;

import java.math.BigDecimal;

/**
 * Task add BigDecimal objects from an array.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class SumBigDecimal implements Runnable {

	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	private static final int ARRAY_SIZE = 500000;
	// use to measure how many time you want to add a number.
	private int counter;
	// sum to add all the number
	private BigDecimal sum = new BigDecimal(0.0);
	// create array of values to add, before we start the timer
	BigDecimal[] values = new BigDecimal[ARRAY_SIZE];

	/**
	 * Constructor initializes the SumDouble with a counter.
	 * 
	 * @param counter
	 *            use to measure how many time you want to add a number.
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
	}

	/**
	 * Add a number from 1 until to the ARRAY_SIZE by using BigDecimal class.
	 */
	@Override
	public void run() {
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
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
		return String.format("Sum array of BigDecimal with count = %,d\n",
				counter) + "sum = " + sum;
	}

}

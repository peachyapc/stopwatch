package stopwatch;

/**
 * Main is responsible for creating the specific tasks we want to measure and
 * calling TaskTimer to compare the different of elapsed time.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */
public class Main {

	/**
	 * Creates the tasks and pass each task to the TaskTimer.
	 */
	public static void main(String[] args) {

		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureAndPrint(new AppendToString(50000));
		taskTimer.measureAndPrint(new AppendToString(100000));
		taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
		taskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		taskTimer.measureAndPrint(new SumDouble(1000000000));
		taskTimer.measureAndPrint(new SumBigDecimal(1000000000));

	}
}

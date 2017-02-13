package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Apichaya Tiwcharoensakul
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** check that the Stopwatch is running or stopped */
	private boolean run;

	/**
	 * Initialize the value of run
	 */
	public Stopwatch() {
		this.run = false;
	}

	/**
	 * reset the stopwatch and start if stopwatch is not running. If the
	 * stopwatch is already running then start does nothing.
	 */
	public void start() {
		if (!run) {
			startTime = System.nanoTime();
			run = true;
		}
	}

	/**
	 * stop the stopwatch. If the stopwatch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (run) {
			stopTime = System.nanoTime();
			run = false;
		}
	}

	/**
	 * Return an elapsed time in second of stopwatch. If the stopwatch is
	 * running, then return the elapsed time since start until the current time.
	 * else If stopwatch is stopped, then return the time between the start and
	 * stop times.
	 * 
	 * @return the elapsed time in seconds with decimal
	 * 
	 */
	public double getElapsed() {
		if (run) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * Check the stopwatch is it still running or not.
	 * 
	 * @return true if the stopwatch is running, false if stopwatch is stopped
	 */
	public boolean isRunning() {
		return run;
	}
}

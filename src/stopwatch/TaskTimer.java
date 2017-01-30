package stopwatch;

/**
 * TaskTimer class that will compute and print the elapsed time for any task,
 * without any duplicate code.
 * 
 * @author Apichaya Tiwcharoensakul
 *
 */

public class TaskTimer {

	/**
	 * Runs a task, measures and prints its running time to the console.
	 * 
	 * @param runnable
	 *            is a task to be run.
	 * 
	 */
	public static void measureAndPrint(Runnable runnable) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}

/**
 * SubtractTask subtracts number 1 ... limit to the counter, then exits.
 * 
 * @author Dacharat Pankong
 *
 */
public class SubtractTask implements Runnable {

	private Counter counter;
	private int limit;

	/**
	 * Initialize SubtractTask from counter and limit number.
	 * 
	 * @param counter
	 *            is counter that used.
	 * @param limit
	 *            is upper limit of numbers to subtract to Counter.
	 */
	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * Subtract counter value by 1.
	 */
	@Override
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(k * (-1));
		// If you want to see when a thread finishes, add this line:
		System.out.println("Done " + Thread.currentThread().getName());
	}

}

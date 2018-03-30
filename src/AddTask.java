/**
 * AddTask adds number 1 ... limit to the counter, then exits.
 * 
 * @author Dacharat Pankong
 */
public class AddTask implements Runnable {
	private Counter counter;
	private int limit;

	/**
	 * Initialize AddTask from counter and limit number.
	 * 
	 * @param counter
	 *            is counter that used.
	 * @param limit
	 *            is upper limit of numbers to add to Counter.
	 */
	public AddTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * Add counter value by 1.
	 */
	@Override
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(k);
		// If you want to see when a thread finishes, add this line:
		System.out.println("Done " + Thread.currentThread().getName());
	}
}

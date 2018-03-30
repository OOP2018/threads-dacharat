/**
 * An accumulator for a sum.
 * 
 * @author Dacharat Pankong
 */
public class Counter {
	protected long total;

	/**
	 * Initialize Counter by set total = 0.
	 */
	public Counter() {
		total = 0;
	}

	/**
	 * Add an amount to the total.
	 * 
	 * @param amount
	 *            is amount to add.
	 */
	public void add(int amount) {
		total += amount;
	}

	/**
	 * Get the total value of counter.
	 */
	public long get() {
		return total;
	}
}

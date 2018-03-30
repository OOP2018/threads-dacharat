/**
 * Count number by using method which is synchronized.
 * 
 * @author Dacharat Pankong
 *
 */
public class SynchronousCounter extends Counter {

	/**
	 * Add an amount to the total.
	 */
	@Override
	public synchronized void add(int amount) {
		super.add(amount);
	}
}

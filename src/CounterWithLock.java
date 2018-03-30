import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Count number by using Lock.
 * 
 * @author Dacharat Pankong 
 *
 */
public class CounterWithLock extends Counter {

	private Lock lock = new ReentrantLock();

	/**
	 * Add an amount to the total.
	 */
	public void add(int amount) {
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}
	}
}

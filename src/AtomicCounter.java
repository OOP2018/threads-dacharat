import java.util.concurrent.atomic.AtomicLong;

/**
 * Count number by using AtomicLong.
 * 
 * @author Dacharat Pankong
 *
 */
public class AtomicCounter extends Counter{
	
	private AtomicLong total;
	
	/**
	 * Initialize AtomicLong.
	 */
	public AtomicCounter() {
		total = new AtomicLong();
	}
	
	/**
	 * Add amount to total.
	 */
	public void add(int amount) {
		total.getAndAdd(amount);
	}
	
	/**
	 * Return value of total.
	 */
	public long get() {
		return total.get();
	}
}

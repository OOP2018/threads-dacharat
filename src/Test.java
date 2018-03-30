/**
 * Test Counter.
 * 
 * @author Dacharat Pankong
 *
 */
public class Test {

	public static void main(String[] args) {
		Counter acc = new Counter();
		acc.add(50);
		acc.add(-15);
		System.out.println(acc.get());
		acc.add(-34);
		System.out.println(acc.get());
	}
}

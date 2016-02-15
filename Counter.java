public class Counter {
	protected int n = 0;
	public void increase() {
		n++;
	}
	
	public int getCount() {
	return n;
	}
}

class SyncCounter extends Counter{
	@Override
	public synchronized void increase() {
		n++;
	}

}
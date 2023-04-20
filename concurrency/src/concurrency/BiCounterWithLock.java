 package concurrency;

 import java.util.concurrent.locks.*;
 import java.util.locks;
 
public class BiCounterWithLock {
	private int i = 0;
	private int j = 1;
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		// get lock
		lockForI.lock();
		i++;
		//release lock
		lockForI.unlock();
	}
	public int getI() {
		return i;
	}
	 public void incrementJ() {
		// get lock
		lockForJ.lock();
		j++;
		//release lock
		lockForJ.unlock();
	}
	
	public int getJ() {
		return j;
	}
	
	
}

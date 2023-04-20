package MultiThreading;

public class CallableTask implements Runnable {
	private String name;
	public CallableTask(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Hi "+ name);
	}

}

package ExceptionHandeling;

public class CheckExpceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherMethod();
			someOtherMethod2();
			Thread.sleep(2000);
		}catch(Exception a) {
			a.printStackTrace();
		}
	}
	
	private static void someOtherMethod2() throws RuntimeException{
		
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
		
	}

}

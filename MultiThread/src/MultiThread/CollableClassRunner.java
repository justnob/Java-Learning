package MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CollableTask implements Callable<String>{

	
	private String name;
	public CollableTask(String name) {
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(10000);
		return "Hello "+name;
		
	}
	
}

public class CollableClassRunner {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		Future<String> sum = executor.submit(new CollableTask("Amar"));
		System.out.println(sum);
		executor.shutdown();

	}

}

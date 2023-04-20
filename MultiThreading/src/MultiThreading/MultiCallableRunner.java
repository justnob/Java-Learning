package MultiThreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiCallableRunner {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorServices = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks = List.of(new CallableTask("Amarnath Sah"), new CallableTask("Rahul Sah"), new CallableTask("Deepak Sah"));
		
		List<Future<String>> result = executorServices.invokeAll(tasks);
		
		executorServices.shutdown();

	}

}

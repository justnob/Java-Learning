package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread{
	
	private int number;
	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.println("Task"+ number+" has started");
		for(int i = number*100;i<number*100+100;i++) {
			int sum = i+1;
			System.out.println(sum);
		}
		System.out.println("Task"+ number+" has ended");
	}
}

public class ExecutarServiceRunner {

	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
	
		executorService.shutdown();
		
	}

}

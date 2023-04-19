package MultiThread;

class Task1 extends Thread{
	public void run() {
		System.out.println("Task1 Started");
		for(int i=0;i<99;i++) {
			int sum = i + 1;
			System.out.println(sum);
		}
		
		System.out.println("Task1 completed");
	}
}

class Task2 implements Runnable{
	public void run() {
		System.out.println("Task2 Started");
		for(int i=100;i<199;i++) {
			int sum = i + 1;
			System.out.println(sum);
		}
		
		System.out.println("Task2 completed");
	}
}

/*class Task3 implements Runnable {
	public void run() {
		System.out.println("Task3 Started");
		for(int i=200;i<299;i++) {
			int sum = i + 1;
			System.out.println(sum);
		}
		
		System.out.println("Task3 completed");
		
	}
	
}*/

public class MultiThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		//Task1
		Task1 task1 = new Task1();
		task1.start();
		//Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		//task2Thread.setPriority(1);
		task2Thread.start();
		//Task3
		//Task3 task3 = new Task3();
		//Thread task3Thread = new Thread(task3);
		//task3Thread.start();
		
		//wait for task1 is completed
		task1.join();
		task2Thread.join();
		System.out.println("Task3 Started");
		for(int i=200;i<299;i++) {
			int sum = i + 1;
			System.out.println(sum);
		}
		
		System.out.println("Task3 completed");
		//Thread.sleep(10000);
		//Thread.yield();
		//to wait

	}

}

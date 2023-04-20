package MultiThreading;


class Task1 extends Thread{
	public void run() {
		System.out.println("Task1 is Started");
		for(int i=101;i<199;i++) {
			System.out.println(i+" ");
		}
		System.out.println("Task1 is Done");
		
	}
}

public class ThradsBasiRunner {

	public static void main(String[] args) {
		//Task1
		Task1 task1 = new Task1();
		task1.start();
		//Task2
		for(int i=201;i<299;i++) {
			System.out.println(i+" ");
		}
		System.out.println("Task2 is Done");
		//Task3
		for(int i=301;i<399;i++) {
			System.out.println(i+" ");
		}
		System.out.println("Task3 is Done");

	}

}

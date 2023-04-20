package ConcurrentMapRunner;
import java.util.List;
import java.util.concurrent.*;

public class CopyOnRigthArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		//Threads-4
		list.add("Ant");
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");
		//Threads-1000
		for(String element:list) {
			System.out.println(element);
		}
		
	}

}

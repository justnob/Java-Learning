package QueueRunner;

import java.util.Queue;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		
		return Integer.compare(value1.length(), value2.length());
	}
	
}

public class Comman {

	public static void main(String[] args){
		Queue<String> queue = new PrioorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Man", "Women", "Aeroplane", "Yak"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}

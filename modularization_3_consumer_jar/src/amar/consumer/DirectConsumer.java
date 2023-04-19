package amar.consumer;

import java.util.List;
import java.util.logging.Logger;

import amar.sorting.algorithm.BubbleSort;

public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Amar", "Akash", "Rahul", "Ritik", "Harshu", "Deepak"));
		
		logger.info(sorted.toString());
	}

}

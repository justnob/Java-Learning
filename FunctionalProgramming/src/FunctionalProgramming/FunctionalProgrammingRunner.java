package FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "cat","Dog", "Elephant");
		//List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9);
		//printBasic(list);
		//printWithFunctionalProgramming(list);
		//printWithFunctionalProgrammingNumber(list2);
		//printBasicWithFilterAt(list);
		printWithFunctionalProgrammingEndsWithAt(list);
		}
	
	//private static void printBasic(List<String> list) {
	//	for(String string:list) {
			
		//	System.out.println(string);
			
		//}
	
	//}
	
	//private static void printWithFunctionalProgrammingNumber(List<String> list) {
		//list.stream().forEach(value -> System.out.println(value));
	
	//}
	
	//private static void printWithFunctionalProgrammingNumber(List<Integer> list2) {
		//list2.stream().forEach(value -> System.out.println(value));
	
//	}
	
	
	//private static void printBasicWithFilterAt(List<String> list) {
		//for(String string:list) {
		//	if(string.endsWith("at")) {
		//	
		//	System.out.println(string);
		//	}
			
		//}
//	}
	
	private static void printWithFunctionalProgrammingEndsWithAt(List<String> list) {
		list.stream().filter(value -> value.endsWith("at")).forEach(value -> System.out.println(value));
	
	}

}

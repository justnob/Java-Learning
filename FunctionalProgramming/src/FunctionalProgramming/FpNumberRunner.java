package FunctionalProgramming;

import java.util.List;

public class FpNumberRunner {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		//list.stream().forEach(value -> System.out.println(value));
		int sum = list.stream().reduce(0, (number1, number2) -> {System.out.println(number1 +" "+ number2); return number1+number2;});
		//int sum2 = list.stream().filter(value -> value%2 == 0).reduce(0, (number1, number2) -> number1+number2);
		System.out.println("Total= "+sum);
		//System.out.println(sum2);
		
		//int sum3 = list.stream().filter(value -> value%2 != 0).reduce(0, (number1, number2) -> number1+number2);
		//System.out.println(sum3);
	}

}

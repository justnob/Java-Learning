package FunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class ExerciseRunner {

	public static void main(String[] args) {
		IntStream numbers = IntStream.range(1, 10);
		
		int sum = numbers.reduce(0,(number1, number2) -> number1 + number2);
		
		System.out.println(sum);
		
		List<String> string = List.of("Appel", "Ant", "Bat");
		string.stream().map(word -> word.toLowerCase().fonrEach(word -> System.out.println(word)));
		

	}

}

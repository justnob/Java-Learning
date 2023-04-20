package FunctionalProgramming2;

import java.util.List;
import java.util.function.Function;


class LengthOfVariable implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		return t.length();
	}
	
}

public class MethodRefrencesRunner {

	public static void main(String[] args) {
		List.of("Apple", "Ball", "cat").stream()
		.map(new LengthOfVariable())
		.forEach(s -> System.out.println(s));
		
		List.of("Apple", "Ball", "cat").stream()
		.map(s -> s.length())
		.forEach(s -> System.out.println(s));
		
		List.of("Apple", "Ball", "cat").stream()
		.map(s -> s.length())
		.forEach(System.out::println);
		
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);

	}

}

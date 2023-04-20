package FunctionalProgramming2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		
		return number%2 ==0;
	}
	
	
}


class SystemOutConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println(t);
		
	}

	}

class DoubleFunction implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
	
}
	

public class lambdaBhindRunner {
	
	
	

	public static void main(String[] args) {
		List.of(23,43,34,45,36,48).stream()
		.filter(e -> e%2 == 0)
		.forEach(e -> System.out.println(e));
		
		
		
		List.of(23,43,34,45,36,48).stream()
		.filter(new EvenNumberPredicate())
		.forEach(new SystemOutConsumer());
		
		List.of(23,43,34,45,36,48).stream()
		.filter(e -> e%2 == 0)
		.map(e -> e*e)
		.forEach(e -> System.out.println(e));
		
		List.of(23,43,34,45,36,48).stream()
		.filter(new EvenNumberPredicate())
		.map(new DoubleFunction())
		.forEach(new SystemOutConsumer());
		
		//Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
		//void forEach(Consumer<? super T> action);
		// void accept(T t);
		//R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//R apply(T t);

	}

}

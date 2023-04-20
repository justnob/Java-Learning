package amar.api.d;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Amarnath", "Krishna");
		List<String> names2 = List.of("Rahul", "Hashrat");
		//List<List<String>> names = List.of(names1, names2);
		var  names = List.of(names1, names2);
		names.stream().forEach(System.out::println);
		
		for(var i=0; i<10;i++) {
			System.out.println(i);
		}
		
		for(var name:names1) {
			System.out.println(name);
		}

	}

}

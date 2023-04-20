package amar.api.a;

import java.util.List;
import java.util.ArrayList;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("amarnath");
		name.add("Akash");
		name.add("Rahul");
		name.add("Harshu");
		name.add("Ritik");
		name.add("Roshan");
		
		List<String> copyOfName = List.copyOf(name);
		
		doNotChange(copyOfName);
		System.out.println(copyOfName);

	}

	private static void doNotChange(List<String> name) {
		name.add("Romeo");
		
	}

}

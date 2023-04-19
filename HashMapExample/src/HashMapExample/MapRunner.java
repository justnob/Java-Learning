package HashMapExample;

import java.util.HashMap;
import java.util.Map;
public class MapRunner {

	public static void main(String[] args) {
		String str = "Amarnath Sah";
		
		Map<Character, Integer> occurances = new HashMap<>();
		
		
		char[] characters = str.toCharArray();
		for(char character:characters) {
			Integer integer = occurances.get(character);
			if(integer == null) {
				occurances.put(character, 1);
			}else {
				occurances.put(character, integer + 1);
			}
			
		}
				System.out.println(occurances);
	}

}

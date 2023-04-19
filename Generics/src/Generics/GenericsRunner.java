package Generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElements("Element 1");
		list.addElements("Element 2");
		System.out.println(list);
		String value = list.get(1);
		System.out.println(value);
		
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElements(Integer.valueOf(5));
		list2.addElements(Integer.valueOf(8));
		System.out.println(list2);
		Integer number = list2.get(1);
		System.out.println(number);
	}
	
}

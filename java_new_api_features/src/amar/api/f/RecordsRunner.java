package amar.api.f;

public class RecordsRunner {
	
	record Person(String name, String email, String phoneNumber) {}

	public static void main(String[] args) {
		Person person = new Person("Amarnath sah", "sahamarnath79@gmail.com", "9807738439");
		
		System.out.println(person);

	}

}

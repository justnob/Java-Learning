package Animal;


	
	abstract class Animal{
		abstract void bark();
	}
	
	class Dog extends Animal{
		public void bark() {
			System.out.println("Bow Bow");
		}
	}
	
	class Cat extends Animal{
		public void bark() {
			System.out.println("Mewo Mewo");
		}
	}
	
	class Cow extends Animal{
		public void bark() {
			System.out.println("Moo Moo");
		}
	}
	
	public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animal = {new Dog(), new Cat(), new Cow()};
		for(Animal animals : animal) {
			
			animals.bark();
			
		}

	}

}

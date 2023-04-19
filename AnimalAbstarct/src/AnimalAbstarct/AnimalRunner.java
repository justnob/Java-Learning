package AnimalAbstarct;

public class AnimalRunner  {

	public static void main(String[] args) {
		Sound[] animals = {new dog(), new cat(), new cow() )};
		for(Sound object : animals) {
			
			object.bark();
		}
		}

	

}

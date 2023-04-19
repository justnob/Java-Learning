package AnimalAbstarct;

public abstract class Animal {
	public void bark() {
		dog();
		cat();
		cow();
	}
	
	abstract void dog();
	abstract void cat();
	abstract void cow();
	
	

}

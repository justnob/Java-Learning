package ReciprAbstractExample;

public abstract class AbstractRecipe {
	
	public void execute() {
		
		getRedy();
		cookingDish();
		cleanUp();
		
	}
	
	abstract void getRedy();
	abstract void cookingDish();
	abstract void cleanUp();

}

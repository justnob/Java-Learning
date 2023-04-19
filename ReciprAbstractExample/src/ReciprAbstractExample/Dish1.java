package ReciprAbstractExample;

public class Dish1 extends AbstractRecipe {

	@Override
	void getRedy() {
		System.out.println("Gte The cooking ingeriadents and utintials");
		
	}

	@Override
	void cookingDish() {
		System.out.println("Cooking the dish1");
		
	}

	@Override
	void cleanUp() {
		System.out.println("Cleaning the remaining and going to sleep");
		
	}
	
	

}

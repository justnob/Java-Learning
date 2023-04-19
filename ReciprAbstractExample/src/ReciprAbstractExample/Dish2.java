package ReciprAbstractExample;

public class Dish2 extends AbstractRecipe {

	@Override
	void getRedy() {
		System.out.println("Get the clean vegetable and cut into small pices");
		System.out.println("Cut the onion");
		System.out.println("Cut the garlic and ginger");
		System.out.println("Turn on the mixer");
		System.out.println("Mix the garlic and gignger togeather and make a past out of them by using mixer");
		System.out.println("Get all the utensils redy");
		System.out.println("Turn on the stove");
		System.out.println("***********************************************************************************************");
		System.out.println("");
		
	}

	@Override
	void cookingDish() {
		System.out.println("Put some oil in the utensils");
		System.out.println("Put the onion after the oil is heated");
		System.out.println("Wait for few min until the onion becomes red");
		System.out.println("Then put the garlic and ginger past in the utensile");
		System.out.println("after some time puy the vegetable in the utensile");
		System.out.println("Put some termeric, chilli powder, Dhanya powder, and othe Mashala");
		System.out.println("Wait for some min and your Dish2 is ready");
		System.out.println("Turn off the stove");
		System.out.println("***********************************************************************************************");
		System.out.println("");
	}

	@Override
	void cleanUp() {
		System.out.println("Clean the stove");
		System.out.println("Clean the utensile");
		System.out.println("you did a great job");
		
	}

}

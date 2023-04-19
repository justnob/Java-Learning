package DoWhileCalculator;

import java.util.Scanner;

public class CalculatorRunner {
	
	this.ex = choice;

	public static void main(String[] args) {
		

		try (Scanner number = new Scanner(System.in)) {
			System.out.println("Do you want to enter in the calculatot");
			System.out.println("press 0-YES & 1-NO");

			int open = number.nextInt();

			if (open == 0) {
				do {

					System.out.println("Welcome to the calculator ");
					System.out.print("Enter the first number= ");

					int number1 = number.nextInt();
					System.out.println("The first number you have entered is =" + number1);

					System.out.print("Enter the second number= ");
					int number2 = number.nextInt();
					System.out.println("The second number you have entered is =" + number2);

					System.out.println("Choices Available are:");
					System.out.println("1 - Add");
					System.out.println("2 - Subtract");
					System.out.println("3 - Divide");
					System.out.println("4 - Multiply");
					System.out.println("5 - Exit");

					System.out.print("Enter the operation to perform= ");
					int choice = number.nextInt();
					System.out.println("You have selected the choice");

					System.out.println("choice " + choice);

					switch (choice) {

					case 1:

						int add = number1 + number2;
						System.out.println("The sum(switch) of the two number is=" + add);
						break;

					case 2:

						int sub = number1 - number2;
						System.out.println("The subtract(switch) of the two number is=" + sub);
						break;

					case 3:

						int div = number1 / number2;
						System.out.println("The divide(switch) of the two number is=" + div);
						break;

					case 4:

						int mul = number1 * number2;
						System.out.println("The multiply(switch) of the two number is=" + mul);
						break;

					default:

					}

				} while (choice != 5);

				System.out.println("Thanks for using this application");

			}

			else {

				System.out.println("Bye..");

			}
		}

	}

}

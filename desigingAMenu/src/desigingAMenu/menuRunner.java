package desigingAMenu;

import java.util.Scanner;

public class menuRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number= ");
		int number1 = scanner.nextInt() ;
		System.out.println("The first number you have entered is =" + number1);
		
		
		System.out.print("Enter the second number= ");
		int number2 = scanner.nextInt() ;
		System.out.println("The second number you have entered is =" + number2);
		
		System.out.println("Choices Available are:");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.print("Enter the operation to perform= ");
		int choice = scanner.nextInt() ;
		System.out.println("You have selected the choice");
		
		System.out.println("choice " + choice);
		
		//performOperationUsingNestedifElse(number1, number2, choice);
		performOperationUsingSwitch(number1, number2, choice);

	}

	private static void performOperationUsingNestedifElse(int number1, int number2, int choice) {
		if(choice == 1) {
			
			int add = number1 + number2;
			System.out.println("The sum of the two number is=" + add);
		}
		
		else if(choice == 2) {
			
			int sub = number1 - number2;
			System.out.println("The subtract of the two number is=" + sub);
		}
		
		else if(choice == 3) {
			
			int div = number1 / number2;
			System.out.println("The divide of the two number is=" + div);
		}
		
		else if(choice == 4) {
			
			int mul = number1 * number2;
			System.out.println("The multiply of the two number is=" + mul);
		}
		
		else {
			
			
			System.out.println("Please input valid number '_'");
		}
		
		
	}
	
	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		
		switch(choice) {
		
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
			
			
			System.out.println("Please input valid number '_'");
		
		}
		
		
		
	}

}

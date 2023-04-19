package boolean_is_weekday;

import java.util.Scanner;

public class isWeekDayInBollean {

	public static void main(String[] args) {
		
		try (Scanner day = new Scanner(System.in)) {
			System.out.println("The number of days in a week are");
			System.out.println("0 - Sunday");
			System.out.println("1 - Monday");
			System.out.println("2 - Tuesday");
			System.out.println("3 - Wednesday");
			System.out.println("4 - Thrusday");
			System.out.println("5 - friday");
			System.out.println("6 - Saturday");
			
			System.out.print("Plaese select the day you want to view is it's holiday = ");
			int us = day.nextInt(); 
			System.out.print("Your selected day is = " + us);
			
			
			
		}

		
		switch (us) {
		
		case 0:
			
			System.out.println("Sunday");
			break;
			
		case (1):
			
			System.out.println("Monday");
			break;
			
		}
			
			
		
		}
		

	
	

}

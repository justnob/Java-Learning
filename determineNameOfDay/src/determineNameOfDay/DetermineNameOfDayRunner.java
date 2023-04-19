package determineNameOfDay;

public class DetermineNameOfDayRunner {

	public static void main(String[] args) {
		System.out.println(determineNamesOfDays(9));

	}
	
	public static String determineNamesOfDays(int dayNumber) {
		
		String result = "";
		
		switch (dayNumber) {
		
		case 0:
			result = "Sunday";
			break;
			
		case 1:
			result = "Monday";
			break;
			
		case 2:
			result = "Tuesday";
			break;
			
		case 3:
			result = "Wednesday";
			break;
			
		case 4:
			result = "Thrusday";
			break;
			
		case 5:
			result = "Friday";
			break;
			
		case 6:
			result = "Saturday";
			break;
			
		default :
			result = "Please ente the number from 0 to 6 onlys";
			break;
		
		
		}
		return result;
		
		
	}

}

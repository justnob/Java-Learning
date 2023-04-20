package amar.api.e;

public class SwitchExpressionRunner {
	
	/*public static String findDayOfTheWeek(int day) {
		String dayOfWeek = "";
		switch(day) {
		case 0: dayOfWeek = "Sunday"; break;
		case 1: dayOfWeek = "Monday"; break;
		case 2: dayOfWeek = "Tuesdy"; break;
		case 3: dayOfWeek = "Wednesday"; break;
		case 4: dayOfWeek = "Thrusday"; break;
		case 5: dayOfWeek = "Friday"; break;
		case 6: dayOfWeek = "Saturday"; break;
		default: throw new IllegalArgumentException("Invalid Option"+ day);
		
		}
		return dayOfWeek;
		
	}*/
	
	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch(day) {
		case 0 -> {
			System.out.println("some complex calculation");
			yield "Sunday";
			} 
		case 1 -> "Monday";
		case 2 -> "Tuesdy";
		case 3 -> "Wednesday";
		case 4 -> "Thrusday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> throw new IllegalArgumentException("Invalid Option"+ day);
		
		};
		return dayOfWeek;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(findDayOfTheWeekWithSwitchExpression(7));
	}

}

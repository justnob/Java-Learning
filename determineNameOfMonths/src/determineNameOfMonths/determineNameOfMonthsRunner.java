package determineNameOfMonths;

public class determineNameOfMonthsRunner {

	public static void main(String[] args) {
		System.out.println(determineNamesOfMonths(100));

	}
	
	public static String determineNamesOfMonths(int years) {
		
		switch (years) {
		
		case 0:
			return "January";
			
		case 1:
			return "February";
			
		case 2:
			return "March";
			
		case 3:
			return "April";
			
		case 4:
			return "May";
			
		case 5:
			return "June";
			
		case 6:
			return "Julay";
			
		case 7:
			return "August";
			
		case 8:
			return "September";
			
		case 9:
			return "Octuber";
			
		case 10:
			return "November";
			
		case 11:
			return "December";
		
		
		}
		
		return " Please input digit 0 - 11 only '_'";
		
	}

}

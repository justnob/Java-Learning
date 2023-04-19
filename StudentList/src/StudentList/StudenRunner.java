package StudentList;

import java.math.BigDecimal;

public class StudenRunner {

	public static void main(String[] args) {
		
		int[] marks = {99, 98, 100, 56};
		Student student = new Student("Raman",marks);
		
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximimMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		
			System.out.println("Total number of subjects are= " + number);
			System.out.println("The total sum of marks is= " + sum);
			System.out.println("The maximim mark obtained is= " + maximumMark);
			System.out.println("The minimum mark obtained is= " + minimumMark);
			System.out.println("The average mark obtained is= " + average);
	}

}

package StudentList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		
		this.setName(name);
		this.marks = marks;
		
		
	}

	public int getTotalSumOfMarks() {
		int add = 0;
		for(int mark:marks) {
			
			 add = add + mark;
			
			
			
		}
		
		return add;
	}

	public int getNumberOfMarks() {
		
	int length = marks.length;
		
		return length;
	}

	public int getMaximimMark() {
		
		Arrays.sort(marks);
		
		int max = marks[marks.length - 1];
		
		return max;
	}

	public int getMinimumMark() {
		
		Arrays.sort(marks);
		
		int min = marks[0];
		
		return min;
	}

	public BigDecimal getAverageMarks() {
		
		 int sum = getTotalSumOfMarks(); 
		 int number = getNumberOfMarks();
		 
		return new BigDecimal(sum).divide (new BigDecimal(number), 3, RoundingMode.UP);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

package ExceptionHandeling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner =new Scanner(System.in);
		int[] numbers = {12,3,4,5};
		int number = numbers[5];
		System.out.println(number);
		System.out.println("Hello");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		System.out.println("Before");
	}

}

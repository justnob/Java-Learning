package ExceptionHandeling;

import java.util.Scanner;

public class FinallyRunner2 {

	public static void main(String[] args) {
		try(Scanner scanner =new Scanner(System.in)){
		int[] numbers = {12,3,4,5};
		int number = numbers[12];
		System.out.println(number);
		//}catch(Exception a) {
			//a.printStackTrace();
		//}finally {
			
		}

	}

}

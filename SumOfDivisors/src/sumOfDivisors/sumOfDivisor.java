package sumOfDivisors;

public class sumOfDivisor {

	private int div ;

	public sumOfDivisor(int div) {
		
		this.div = div;
		
	}
	
	public int answer() {
		
		int sum =0;
		
		for(int j = 2; j < div ; j++) {
			if(div % j == 0) {
			
			sum = sum + j;
			}
		}
		
		
		
		return sum;
		
		
		
	}

	
	
}

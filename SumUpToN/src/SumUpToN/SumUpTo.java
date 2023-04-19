package SumUpToN;

public class SumUpTo {
	
	private int add;

	public SumUpTo( int add) {
		
		this.add = add;
		
	}
	
	public int sumUpToN() {
		
		int sum = 0;
		
		for(int i=1;i <= add;i++) {
			
			 sum = sum + i ;	
		}
		return sum;
		
	}
	
	

}

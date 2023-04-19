package ExceptionHandeling;

class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void addMethod(Amount other) throws CurrenciesDonotMatchException {
		
		if(this.currency == other.currency) {
		
		this.amount = other.amount+this.amount;
		}else {
			//throw new Exception("Currency don't match "+this.currency+ " & "+other.currency);
			throw new CurrenciesDonotMatchException("Currency don't match "+this.currency+ " & "+other.currency);
		}
	}
	
	public String toString() {
		return amount+ " " + currency;
	}
	
	class CurrenciesDonotMatchException extends Exception {
		public CurrenciesDonotMatchException (String msg) {
			super(msg);
	}
}
}

public  class ThrowingExpeptionRunner {

	public static void main(String[] args) throws ExceptionHandeling.Amount.CurrenciesDonotMatchException{
		
		Amount amount1 = new Amount("USD", 500);
		Amount amount2 = new Amount("EUR", 200);
		amount1.addMethod(amount2);
		System.out.println(amount1);
		
		

	}
}



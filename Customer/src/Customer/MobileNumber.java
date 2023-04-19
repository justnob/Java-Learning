package Customer;

public class MobileNumber {
	
	private String firstMobileNumebr;
	private String secondMobileNumber;
	public MobileNumber(String firstMobileNumebr) {
		super();
		this.firstMobileNumebr = firstMobileNumebr;
		this.secondMobileNumber = secondMobileNumber;
		
		

	}
	public String getFirstMobileNumebr() {
		return firstMobileNumebr;
	}
	public void setFirstMobileNumebr(String firstMobileNumebr) {
		this.firstMobileNumebr = firstMobileNumebr;
	}
	public String getSecondMobileNumber() {
		return secondMobileNumber;
	}
	public void setSecondMobileNumber(String secondMobileNumber) {
		this.secondMobileNumber = secondMobileNumber;
	}	
	
	public String toString() {
		return String.format("firstMobileNumebr = %s", firstMobileNumebr);
	}
}

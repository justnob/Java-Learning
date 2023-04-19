package Customer;

public class Customer {

	private String name ;
	private Address homeAddress;
	private Address workAddress;
	private Address birthAddress;
	private MobileNumber firstMobileNumber;
	private MobileNumber secondMobileNumber;
	
	public Customer(String name, Address homeAddress, Address birthAddress, MobileNumber firstMobileNumber ) {
		this.name = name;
		this.homeAddress = homeAddress;
		this.birthAddress = birthAddress;
		this.firstMobileNumber = firstMobileNumber;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public MobileNumber getfirstMobileNumber() {
		return firstMobileNumber;
	}

	public void setfirstMobileNumber(MobileNumber secondMobileNumber) {
		this.firstMobileNumber = firstMobileNumber;
	}

	public MobileNumber getsecondMobileNumber() {
		return secondMobileNumber;
	}

	public void setMobileNumbersecond(MobileNumber secondMobileNumber) {
		this.secondMobileNumber = secondMobileNumber;
	}
	
	
	public String toString() {
		
		return String.format("  1.name-[%s] \n  2.birthAddress-[%s] \n  3.homeAddress-[%s] \n  4.firstMobileNumber-[%s]",
								name, birthAddress, homeAddress, firstMobileNumber );
	}
	
}

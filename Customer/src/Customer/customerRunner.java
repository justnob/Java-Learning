package Customer;

public class customerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line2", "Nepal", "Gandaki", "Kathmandu", "Tinkune", "335006");
		Address birthAddress = new Address("line4", "Nepal", "Sagarmath","Saptari", "Rajbiraj", "54600");
		MobileNumber firstmobileNumber = new MobileNumber("9807738439");
		Customer customer = new Customer("Amarnath sah", homeAddress, birthAddress, firstmobileNumber );
		
		
		System.out.println(customer);

	}

}

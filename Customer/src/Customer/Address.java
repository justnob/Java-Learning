package Customer;

public class Address {
	
	private String linr1;
	private String country;
	private String zone;
	private String state;
	private String city;
	private String zip;
	
	//constructor
	public Address(String linr1, String country, String zone, String state, String city, String zip) {
		super();
		this.linr1 = linr1;
		this.country = country;
		this.zone = zone;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}

	public String getLinr1() {
		return linr1;
	}

	public void setLinr1(String linr1) {
		this.linr1 = linr1;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	public String toString() {
		
		return String.format("line = %s, country = %s, zone = %s, state = %s, city = %s, zip = %s", linr1, country, zone, state, city
				, zip);
	}

	
	
}

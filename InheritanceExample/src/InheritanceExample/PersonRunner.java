package InheritanceExample;

public class PersonRunner {
	
	public static void main(String[] args) {
		

	
	Employee employee = new Employee("Amarnath Sah", "Engineear");
	
	//employee.setName("Amarnath Sah");
	employee.setPhone("9807738439");
	employee.setEmail("sahamarnath79@gmail.com");
	//employee.setTital("Engineear");
	employee.setEmployer("Cotiviti");
	employee.setEmployeeGrade(1);
	employee.setSalary(75000);
	
	
	System.out.println(employee);
	}
}

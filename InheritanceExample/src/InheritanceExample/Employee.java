package InheritanceExample;



public class Employee extends Person {
	
	




	private String tital;
	private String employer;
	private int employeeGrade;
	private int salary;
	

	public Employee(String name, String tital) {
		super(name);
		this.tital = tital;
		
	}


	
	public String getTital() {
		return tital;
	}





	/*public void setTital(String tital) {
		this.tital = tital;
	}*/





	public String getEmployer() {
		return employer;
	}





	public void setEmployer(String employer) {
		this.employer = employer;
	}





	public int getEmployeeGrade() {
		return employeeGrade;
	}





	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}





	public int getSalary() {
		return salary;
	}





	public void setSalary(int salary) {
		this.salary = salary;
	}





	public String toString() {
		
		return String.format(" Name=[%s] \n Phone Number=[%s] \n Email ID=[%s] \n Tital=[%s] \n Employer=[%s] \n Employee Grade=[%d] \n Salry=[%d]", 
								super.getName(), super.getPhone(), super.getEmail(), tital, employer, employeeGrade, salary);
	}

}

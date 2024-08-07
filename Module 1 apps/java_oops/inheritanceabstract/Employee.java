package inheritanceabstract;

public abstract class Employee {
	
	private String fname;
	private String lname;
	private double salary;
	
//	
//	public Employee() {  not good idea because it will make empty object
//		
//	}
//	
	public Employee(String fname, String lname, double salary ) {
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract void increaseSalary(double amount);
	
}
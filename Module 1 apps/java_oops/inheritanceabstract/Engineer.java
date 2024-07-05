

package inheritanceabstract;

//inheriting from abstract
//it is now called concrete subclass

public class Engineer extends Employee {
	
	private String education;
	private String hardware;
	
	
	public Engineer(String fname, String lname, double salary, String education, String hardware) {
		super(fname, lname, salary);
		this.education = education;
		this.hardware = hardware;
	}
	
	
	public String getEducation() {
		return education;
	}
	
	public String getHardware() {
		return hardware;
	}
	
	public void analyzeReq() {
		System.out.println("Analyzing req -- ");
	}
	
	public void designSoftware() {
		System.out.println("Designing sw -- ");
	}
	
	public void implementCode () {
		System.out.println("Implementing -- ");
	}


	@Override
	public void increaseSalary(double amount) {
		// TODO Auto-generated method stub
		
		double updateSalary = this.getSalary() +amount;
		
		this.setSalary( updateSalary);
		
	}
	
	
	
}

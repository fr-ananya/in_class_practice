package inheritance;


public class Manager extends Employee{
	
	private double quarterlyBonus;
	
	public Manager(String fname, String lname, double salary, double quarterly) {
		super(fname, lname, salary);
	}
	
	@Override
	public void increaseSalary(double amount) { // for typo by developer
		super.increaseSalary(amount);
	}
	
	public void playGolfWithClient() {
		System.out.println("Playing golf .. ");
	}
	
	public void increaseBonus() {
		
		this.quarterlyBonus+=1000;
	}
	
	public double getSalary() {
		return super.getSalary();
	}
	
	public double getQuarterlyBonus() {
		return quarterlyBonus;
	}
	
}
package realtimeinterface;


//import Schedule;

// also becomes concrete subclass
public class Manager extends Employee implements Scheduleable{
	
	private double quarterlyBonus;
	
	public Manager(String fname, String lname, double salary, double quarterly) {
		super(fname, lname, salary);
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
	
	
	@Override
	public void increaseSalary(double amount) { // for typo by developer
//		super.increaseSalary(amount); cant do this because method is not implemented
		
		if(amount>0) {
			setSalary(getSalary()+amount);
			increaseBonus();
			System.out.println("Salary inc success .. ");
		}
		else {
			System.out.println("Invalid amount. Salary must be +ve .. ");
		}
		
	}
	
	public void playGolfWithClient() {
		System.out.println("Playing golf .. ");
	}
	
	

	@Override
	public void schedule() {
		// TODO Auto-generated method stub
		Schedule schedule = new Schedule("meet at 10 am");
		schedule.printSchedule();
	}
	
}
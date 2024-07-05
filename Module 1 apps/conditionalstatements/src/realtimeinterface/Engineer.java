

package realtimeinterface;

//inheriting from abstract
//it is now called concrete subclass

public class Engineer extends Employee implements Scheduleable{
	
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
		
			
		if(amount>0) {
			setSalary(getSalary()+amount);
			System.out.println("Salary inc success .. ");
		}
		else {
			System.out.println("Invalid amount. Salary must be +ve .. ");
		}
		
	}
	
	@Override
	public void schedule() {
		// TODO Auto-generated method stub
		Schedule schedule = new Schedule("Dev meet at 2 pm");
		schedule.printSchedule();
	}


	@Override
	public void scheduleMeeting(String meetingDetails) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isWithinWorkingHours(String meetingDetails) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}

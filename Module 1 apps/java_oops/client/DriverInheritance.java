package client;

import inheritance.Manager;
import inheritance.Engineer;


public class DriverInheritance {

	public static void main(String[] args) {
		Manager manager = new Manager("Alice", "Smith", 80000, 5000);
		
		System.out.println("Manger: " + manager.getFirstName() + " " + manager.getLastName());
		System.out.println("Current Salary: $" + manager.getSalary());
		System.out.println("Quarterly Bonus : $" + manager.getQuarterlyBonus());
		
		manager.increaseSalary(5000);
		
		System.out.println("New Salary: $" + manager.getSalary());
		System.out.println("New Quarterly Bonus : $" + manager.getQuarterlyBonus());
		manager.playGolfWithClient();
		
		Engineer engineer = new	Engineer("Bob", "Johnson", 70000, "Bachelor's", "Intel i7");
		
		System.out.println("Engineer: " + engineer.getFirstName() + " " + engineer.getLastName());
		System.out.println("Current Salary: $" + engineer.getSalary());
		System.out.println("Education : " + engineer.getEducation());
		System.out.println("Hardware : "+ engineer.getHardware());
		engineer.increaseSalary(3000);
		System.out.println("New Salary : $ "+ engineer.getSalary());
		engineer.analyzeReq();
		engineer.designSoftware();
		engineer.implementCode();
	}

}

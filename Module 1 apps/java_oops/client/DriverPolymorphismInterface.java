package client;

import realtimeinterface.Employee;
import realtimeinterface.Manager;
import realtimeinterface.Engineer;
import realtimeinterface.Schedule;
import realtimeinterface.Scheduleable;



public class DriverPolymorphismInterface {
	public static void main(String[] args) {
//		List<Employee> list = new ArrayList<>();
//		list.add(new Employee("an", "sharma", 15)); cannot create object of abstract class
		
//		Employee employee;
//		employee = new Manager("an", "sharma", 15, 10);
//		employee = new Engineer("an", "sharma", 15, "Btech", "intel");
		
		Employee[] employees = new Employee[2];
		employees[0] = new Manager("an", "sharma", 15, 10);
		employees[1] = new Engineer("an", "sharma", 200, "Btech", "intel");
		
		for(Employee emp : employees) {
			System.out.println("Emp: " + emp.getFirstName()+ " " +  emp.getLastName());
			System.out.println("Current salary $:" + emp.getSalary());
			emp.increaseSalary(100); // this is polymorphic call
			System.out.println("New salary $:" + emp.getSalary());
			
			if(emp instanceof Scheduleable) {
				((Scheduleable) emp).schedule(); // downcast
			}
		}
		
		
	}
}

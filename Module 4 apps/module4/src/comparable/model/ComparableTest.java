package comparable.model;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Student> studentSet = new TreeSet<>();

		studentSet.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student("John", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));
		studentSet.add(new Student("molly", "Grant", 1004, 2.3));
// doesnt get added bceause if acc to compareto in treeset if it is not unique then it doesnt get added
		
		for (Student student : studentSet) {
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", student.getFirtName(), student.getLastName(),
					student.getStudentID(), student.getGpa());
		}

	}

}
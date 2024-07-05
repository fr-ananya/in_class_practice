package comparator.model;

import java.util.Comparator;
import java.util.TreeSet;

import comparable.model.Student;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Comparator<Student> comparator = new NameComp();
		TreeSet<Student> studentSet = new TreeSet<>(comparator);

		studentSet.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student("aJohn", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));

		for (Student student : studentSet) {
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", student.getFirtName(), student.getLastName(),
					student.getStudentID(), student.getGpa());
		}

	}

}

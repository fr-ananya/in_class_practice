package comparator.model;

import java.util.Comparator;

import comparable.model.Student;

public class NameComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getFirtName().compareTo(s2.getFirtName());
	}

}
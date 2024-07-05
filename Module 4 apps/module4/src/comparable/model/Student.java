
package comparable.model;

public class Student implements Comparable<Student> {

	String firtName, lastName;
	int studentID = 0;
	double gpa = 0.0;

	public Student(String firtName, String lastName, int studentID, double gpa) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.gpa = gpa;
	}

	public String getFirtName() {
		return firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student o) {
		double f = this.gpa - o.gpa;
		if (f == 0.0) {
			return 0;// signifies equals
		} else if (f < 0.0) {
			return -1;
		} else
			return 1;
	}

}

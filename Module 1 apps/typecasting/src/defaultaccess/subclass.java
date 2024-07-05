package defaultaccess;

public class subclass  extends sampleclassdefault {

	@Override
	void method() { // access the method
		new sampleclassdefault(); // access the constructor
		new sampleclassdefault().field = "10"; // access the field
	}
}
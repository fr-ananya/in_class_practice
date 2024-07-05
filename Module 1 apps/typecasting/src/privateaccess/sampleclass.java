package privateaccess;

public class sampleclass {

	
	private String field;
	
	private sampleclass() {
		System.out.println("constructor private");
	}
	
	private void method() {
		System.out.println("method is private");
	}

}

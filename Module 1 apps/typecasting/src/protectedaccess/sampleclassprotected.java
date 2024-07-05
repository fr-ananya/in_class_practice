package protectedaccess;

public class sampleclassprotected {

	
	private String field;
	
	private sampleclassprotected() {
		System.out.println("constructor private");
	}
	
	private void method() {
		System.out.println("method is private");
	}

}

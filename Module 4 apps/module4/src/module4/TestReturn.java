package module4;

public class TestReturn {
	public static void main(String[] args) {
		
		display();
		
		int sum = add(10,20);
		System.out.println("sum: " + sum);
	}
	
	private static int add(int i, int j) {
		return i+j;
	}
	
	static void display() {
		System.out.println("no explicit");
	}
}

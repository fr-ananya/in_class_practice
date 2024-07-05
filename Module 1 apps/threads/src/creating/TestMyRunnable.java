package creating;

public class TestMyRunnable {
	public static void main(String[] args) {
		
		MyRunnable target = new MyRunnable();
		
		Thread t1 = new Thread(target);
		
		t1.start();
		
		
	}
}

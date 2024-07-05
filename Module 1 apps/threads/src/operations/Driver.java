package operations;

public class Driver {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		t2.start();
		
		try {
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(" both threads have finished exe");
		
		
	}
}



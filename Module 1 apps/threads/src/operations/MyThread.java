package operations;


public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(  Thread.currentThread().getName()+ "this thread is running ... " + i);
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
}
package deadlock;

public class Resource {
	private final String name;
	
	public Resource(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public synchronized void acquire(Resource other) {
		System.out.println(Thread.currentThread().getName() + " acquired " + this.getName() + " waiting to acquire  " + other.getName());
		other.access();
	}

	private synchronized void access() {
		System.out.println(Thread.currentThread().getName() + " accessing " + this.getName());
	}
	
}

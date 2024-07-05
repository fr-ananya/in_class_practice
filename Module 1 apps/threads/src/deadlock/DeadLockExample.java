package deadlock;

public class DeadLockExample {

	public static void main(String[] args) {
		final Resource resource1 = new Resource("Resource1");
		final Resource resource2 = new Resource("Resource2");

		Thread thread1 = new Thread(() -> {
//			acquireResourceInOrder(resource1, resource2);
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName() + " locked " +resource1.getName());
			
				try {
					Thread.sleep(50);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " locked " +resource2.getName());
				}
			}
		}, "Thread1");

		Thread thread2 = new Thread(() -> {
//			acquireResourceInOrder(resource1, resource2);
			
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName() + " locked " +resource1.getName());
			
				try {
					Thread.sleep(50);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " locked " +resource2.getName());
				}
			}
		}, "Thread2");

		thread1.start();
		thread2.start();
	}

	private static void acquireResourceInOrder(Resource resource1, Resource resource2) {
		Resource firstResource, secondResource;
		if (resource1.getName().compareTo(resource2.getName()) < 0) {
			firstResource = resource1;
			secondResource = resource2;
		} else {
			firstResource = resource2;
			secondResource = resource1;
		}

		synchronized (firstResource) {
			System.out.println(Thread.currentThread().getName() + " locked " + firstResource.getName());

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (secondResource) {
				System.out.println(Thread.currentThread().getName() + " locked " + secondResource.getName());

			}
		}
	}

}


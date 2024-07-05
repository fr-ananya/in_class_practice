package Queue;


public class TestQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println("queue Elements");
		queue.display();
		
		System.out.println("Front element is: " + queue.peek());
		
		System.out.println("Dequeued element is: " + queue.dequeue());
		System.out.println("queue after dequeueing:");
		queue.display();

	}
}

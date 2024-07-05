package Queue;

public class Queue {
	
	private Node front;
	private Node rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
		
	}
	
	public void enqueue(int val) {
		Node newNode = new Node(val);
		
		if(rear==null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear  = newNode;
			
		}
	}
	
	public int dequeue() {
		if(front == null) {
			throw new IllegalArgumentException("queue is empty");
			
		}
		int value  = front.value;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		return value;
		
	}
	
	public int peek() {
		if(front == null) {
			throw new IllegalArgumentException("queue is empty");
			
		}
		return front.value;
		
	}
	public void display() {
		Node current = front;
		while(current!=null) {
			System.out.print(current.value + " -> "  );
			current = current.next;
		}
		System.out.println("done print");
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
}

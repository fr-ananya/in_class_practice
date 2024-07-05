package Stack;


public class Stack {
	
	private Node top;
	
	public Stack() {
		this.top = null;
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}
	
	public int pop() {
		if ( top == null ) {
			throw new IllegalStateException("Stack is empty");
		}
		int value = top.value;
		top = top.next;
		return value;
	}
	
	public int peek() {
		if ( top == null ) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.value;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void display() {
		Node current = top;
		while ( current != null ) {
			System.out.print(current.value + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}

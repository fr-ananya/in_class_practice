package SinglyLinkedList;



public class SinglyLinkedList {
	private Node head;
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	
	public synchronized void delete (int value) {
		if ( head == null )
			return;
		
		if ( head.value == value) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while ( current.next != null && current.next.value!= value) {
			current = current.next;
		}
		if ( current.next != null) {
			current.next = current.next.next;
		}
	}
	
	
	
	public synchronized void travese() {
		Node current = head;
		while ( current != null ) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public synchronized void insertAtTail(int value) {
		Node newNode = new Node(value);
		if ( head == null ) {
			head = newNode;
		}else  {
			Node current = head;
			while (current.next != null ) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public synchronized void insertAtHead(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

}

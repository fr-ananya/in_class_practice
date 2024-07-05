package DoubleLinkedList;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		
	}
	
	public void traverseForward() {
		Node curr = head;
		
		while(curr !=null) {
			System.out.print(curr.value +" -> ");
			curr = curr.next;
		}
		
		System.out.println("done printing");
	}
	
	public void traverseBackward() {
		Node curr = tail;
		
		while(curr !=null) {
			System.out.print(curr.value +" -> ");
			curr = curr.prev;
		}
		
		System.out.println("done printing");
	}
	
	public void delete(int val) {
		Node curr = head;
		
		while(curr !=null) {
			if(curr.value == val) {
				if(curr.prev != null) {
					curr.prev.next = curr.next;
				}else {
					head = curr.next;
				}
				
				if(curr.next!=null) {
					curr.next.prev = curr.prev;
				}else {
					tail = curr.prev;
				}
				break;
			}
			
			curr = curr.next;
		}
		
		System.out.println("done printing");
	}
	
	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void insertAtTail(int value) {
		Node newNode = new Node(value);
		
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void insertAtMiddle( int val) {
		Node newNode = new Node(val);
		
		int pos , size = 0;
		
		Node tempHead = head;
		
		while(tempHead != null) {
			size++;
			tempHead = tempHead.next;
		}
		pos = size/2;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
		else {
			Node current = head;
			int count = 1;
			
			while (current != null && count < pos) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                newNode.prev = current;
                current.next = newNode;
                if (newNode.next != null) {
                    newNode.next.prev = newNode;
                }
            }
        }
    }


	
	

}

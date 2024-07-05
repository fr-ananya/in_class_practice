package DoubleLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
	
		list.insertAtHead(1);
		list.insertAtHead(2);
		list.insertAtHead(3);
		list.insertAtHead(4);
		
		System.out.println("printing list");
		list.traverseBackward();
		list.traverseForward();
		
		list.delete(4);
		list.traverseForward();
		
		
		
		
	}

}

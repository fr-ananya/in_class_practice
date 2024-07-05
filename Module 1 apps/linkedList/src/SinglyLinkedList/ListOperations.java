package SinglyLinkedList;



public class ListOperations implements Runnable {

	private SinglyLinkedList list;
	private String operation;
	private int value;

	public ListOperations(SinglyLinkedList list, String operation, int value) {
		super();
		this.list = list;
		this.operation = operation;
		this.value = value;
	}

	@Override
	public void run() {
		switch (operation) {
		case "insertHead":
			list.insertAtHead(value);
			System.out.println("inserted " + value + " at head");
			break;
		case "insertTail":
			list.insertAtTail(value);
			System.out.println("inserted " + value + " at tail");
			break;
			
		case "delete":
			list.delete(value);
			System.out.println("Deleted " + value);
			break;
			
		case "traverse":
			list.travese();
			break;

		default:
			throw new IllegalArgumentException("Unknown operation: " + operation);
		}

	}

}


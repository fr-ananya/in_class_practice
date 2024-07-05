package SinglyLinkedList;



public class ConcurrentModification {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		Thread t1 = new Thread(new ListOperations(list, "insertHead", 1));
		Thread t2 = new Thread(new ListOperations(list, "insertTail", 2));
		Thread t3 = new Thread(new ListOperations(list, "insertHead", 3));
		Thread t4 = new Thread(new ListOperations(list, "delete", 1));
		Thread t5 = new Thread(new ListOperations(list, "traverse",0));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}




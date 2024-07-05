package CircularLinkedList;
public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;  // Link back to head
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Link back to head
        }
    }
    
    

    // Remove a node from the list
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != tail) {
            if (current.data == data) {
                if (previous == null) {
                    // Removing the head node
                    if (head == tail) {  // Only one node in the list
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;  // Link tail to new head
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;  // Update tail if last node is removed
                    }
                }
                System.out.println("Node with data " + data + " removed");
                return;
            }
            previous = current;
            current = current.next;
        }

        // Check if the tail node needs to be removed
        if (tail.data == data) {
            if (head == tail) {  // Only one node in the list
                head = null;
                tail = null;
            } else {
                previous.next = tail.next;
                tail = previous;
            }
            System.out.println("Node with data " + data + " removed");
            return;
        }

        System.out.println("Node with data " + data + " not found");
    }

    // Search for a node in the list
    public boolean search(int data) {
        if (head == null) {
            return false;
        }

        Node current = head;

        while (current != tail) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        // Check the tail node
        return tail.data == data;
    }

    // Display the nodes in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        // Print the tail node
        System.out.print(tail.data + " ");
        System.out.println();
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }
}

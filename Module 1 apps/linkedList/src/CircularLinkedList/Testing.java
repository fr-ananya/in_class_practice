package CircularLinkedList;


public class Testing {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Add nodes to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display the list
        System.out.println("Circular Linked List:");
        list.display();

        // Search for nodes
        System.out.println("Searching for 20: " + list.search(20)); // true
        System.out.println("Searching for 50: " + list.search(50)); // false

        // Remove a node
        list.remove(20);

        // Display the list after removal
        System.out.println("After removing 20:");
        list.display();

        // Remove the head node
        list.remove(10);

        // Display the list after removing head
        System.out.println("After removing head (10):");
        list.display();

        // Remove the tail node
        list.remove(40);

        // Display the list after removing tail
        System.out.println("After removing tail (40):");
        list.display();

        // Attempt to remove a non-existing node
        list.remove(50);

        // Display the list after attempting to remove non-existing node
        System.out.println("After attempting to remove non-existing node (50):");
        list.display();

        // Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}


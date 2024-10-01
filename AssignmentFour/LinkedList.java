// Kennedy, full disclosure, this is copilot generated. 

package AssignmentFour;

public class LinkedList {
	Node head; // Head of the list

    // Node class representing each element of the list
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to delete a node with a specific key (value)
    public void deleteNode(int key) {
        // Case 0: If the list is empty
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // Case 1: If the node to be deleted is the head node (first node)
        if (head.data == key) {
            head = head.next; // Move the head to the next node
			System.out.println();
            System.out.println("Node at the beginning deleted.");
            return;
        }

        // Start traversing the list to find the node with the given key
        Node temp = head;
        Node prev = null;

        // Traverse the list until we find the node with the given key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Case 0 (continued): If the key was not found in the list
        if (temp == null) {
			System.out.println();
            System.out.println("Node with key " + key + " not found.");
            return;
        }

        // Case 2: If the node to be deleted is the last node
        if (temp.next == null) {
            prev.next = null; // Set the second last node's next to null
			System.out.println();
            System.out.println("Node at the end deleted.");
            return;
        }

        // Case 3: If the node to be deleted is somewhere in the middle
        prev.next = temp.next; // Bypass the current node
		System.out.println();
        System.out.println("Node with key " + key + " deleted from the middle.");
    }

    // Utility method to add a node at the end of the list
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
    }

    // Method to print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Driver method to test the delete functionality
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Adding nodes to the linked list
        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);
        llist.append(5);
		System.out.println();
        System.out.println("Initial Linked List:");
        llist.printList();

        // Deleting node at the beginning
        llist.deleteNode(1);
        llist.printList();

        // Deleting node at the end
        llist.deleteNode(5);
        llist.printList();

        // Deleting node in the middle
        llist.deleteNode(3);
        llist.printList();

        // Trying to delete a node that doesn't exist
        llist.deleteNode(10);
        llist.printList();
		System.out.println();
    }
}


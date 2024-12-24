package CH10Linkedlist;
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {
    static Node head;

    public CircularLL() {
        head = null;
    }

    static void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    static void delete() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.next != null && current.next != head) {
            prev = current;
            current = current.next;
        }

        if (current == head) {
            head = null; // If there's only one node, delete it
        } else {
            prev.next = head; // Remove the last node from the circular link
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Class2_Q7implementCircularLL {
    public static void main(String[] args) {
        CircularLL circularLL = new CircularLL();

        // Appending elements to the circular linked list
        circularLL.append(1);
        circularLL.append(2);
        circularLL.append(3);

        // Displaying the circular linked list
        System.out.println("Circular Linked List:");
        circularLL.display();

        // Deleting a node from the circular linked list
        circularLL.delete();

        // Displaying the circular linked list after deletion
        System.out.println("Circular Linked List after deletion:");
        circularLL.display();
    }
}

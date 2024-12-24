package CH10Linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public static Node head;

    public LinkedList() {
        this.head = null;
    }

    static void append(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Function to detect a cycle in the linked list
    static boolean hasCycle() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }
}

public class Class4_Q1CycleDetection {
    public static void main(String[] args) {
        // Example usage
        LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.append(0, 1);
        list.append(1, 2);
        list.append(2, 3);

        // Create a cycle for testing
        list.head.next.next.next = list.head;

        // Check for a cycle
        boolean hasCycle = list.hasCycle();
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}

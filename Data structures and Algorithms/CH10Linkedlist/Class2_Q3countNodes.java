package CH10Linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Class2_Q3countNodes {
    static int countNodes(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a linked list
        System.out.println("Enter the elements (enter -1 to stop):");
        int element = sc.nextInt();
        Node head = null;
        Node tail = null;

        while (element != -1) {
            Node newNode = new Node(element);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            element = sc.nextInt();
        }

        // Counting nodes without using inbuilt size()
        int nodeCount = countNodes(head);
        System.out.println("Number of nodes in the linked list: " + nodeCount);

        sc.close();
    }
}

package CH10Linkedlist;

class Node {
    public int data;
    public Node next;

    public Node(int value) {
        this.data = value;
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
    
    static void delete(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static int size() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }
   
    static boolean isEmpty() {
        return head == null;
    }
}

public class Class1_Q1ImplementLinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Is empty: " + list.isEmpty());
        list.append(0, 10); 
        list.display();
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        list.append(1, 20); 
        list.append(2, 30); 
        list.display();
        list.delete(0); 
        list.display();
        list.append(2, 40); 
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
    }
}

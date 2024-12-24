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
            head.next =head;
        } else {
            Node current = head;
            while (current.next != null && current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
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
    static void split(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        Node slow =head;
        Node fast = head;
        while (fast.next!=head && fast.next.next!=head) {
            slow =slow.next;
            fast=fast.next.next;

        }
        Node head1=head;
        Node head2 =slow.next;
        slow.next=head1;
       displayhalf2(head1);
       System.out.println("...................................");
        displayhalf2(head2);

    }
    static void displayhalf2(Node start){
        Node current = start;
      do {
        System.out.print(current.data + " ");
        current=current.next;
      } while (current!=start);
    }
}

public class Class4_Q7SplitCircular {
    public static void main(String[] args) {
        CircularLL l = new CircularLL();
        l.append(23);
         l.append(30);
         l.append(40);
         l.append(50);
         l.append(60);
         l.append(70);
         l.display();
         l.split();
        
        
    }
}

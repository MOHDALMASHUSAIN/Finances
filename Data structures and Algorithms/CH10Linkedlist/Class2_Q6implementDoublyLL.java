package CH10Linkedlist;

class Node{
    public int data;
    public Node next;
    public Node prev;
    public Node(int data){
        this.data =data;
        this.next=null;
        this.prev = null;
    }

}
 class DoublyLL{
    static Node head;
    static Node tail;
    DoublyLL(){
        this.head =null;
        this.tail = null;
    }
      static void append(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail =newNode;
            
        }
        else{
            tail.next=newNode;
            newNode.prev =tail;
            tail =newNode;
        }
      }


      

 }

public class Class2_Q6implementDoublyLL {
    public static void main(String[] args) {
        
    }
    
}

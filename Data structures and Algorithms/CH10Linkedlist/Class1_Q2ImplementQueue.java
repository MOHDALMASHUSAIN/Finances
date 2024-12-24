package CH10Linkedlist;
class Node{
    public int data;
    public Node next ;   
    public Node(int value){
        this.data = value;
        this.next=null;
    }                                                                                                                              
}
class LinkedList{
    public static Node head;
    public LinkedList(){
        this.head = null;
    }
    static void append( int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }   
    static int  delete(){
        if(head == null){
            System.out.println("underflow");
            return -1;
        }
            head = head.next;
            
            return 1; 
        }
   
          static void display(){
        Node current = head;

        while (current!=null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        }     
    }

public class Class1_Q2ImplementQueue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(11);        
        list.append(22);
        list.append(33);
        list.display();  
        list.delete(); 
        list.display(); 

        //System.out.println(list.delete());
     
    }
    
}

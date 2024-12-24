package CH7Stack;

//import CH9Queue.Stack;

//import java.util.Stack;
class Stack {
   private static int Stackarr[];
   private static int top ;
    private static int maxSize;

    public Stack(int capacity){
    this.top =-1;
    this.maxSize =capacity;
    this.Stackarr = new int [capacity];
    }

    public void push(int value){
        if(top<maxSize-1){

             Stackarr[++top] = value;
            System.out.println("item stored is :: " + value);
          
        }
        else{
            System.out.println("case of stack overflow");
        }
    }
     public int pop(){
        if(top>-1){
            int element = Stackarr[top--];
            System.out.println("removed element is");
            return element;
        }
        else{
            System.out.println("Case of underflow ");
            return -1;
        }
     }

    static int peek(){
        if(top>-1){
            int element = Stackarr[top];
            System.out.println("peek element is ");
            return element;
        }
        else{
            System.out.println("Case of Underflow");
            return -1;
 
        }        
    }
    static boolean isEmpty(){
        return (top==-1);
     
    }
    static boolean isFull(){
        return (top==maxSize-1);
    }
    static void PrintStack(){
        if(!isEmpty()){
            System.out.print("element of stack is ::");
            for(int i =0;i<maxSize;i++){
                System.out.print( Stackarr[i]+" ");
            }}

            else{
                  System.out.println("Stack is empty");
        }
          
        }
    }

public class Class1_Q1ImplementStackviaArray {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(5);
        s.push(51);
        s.push(576);
       System.out.println(s.pop()); 
       System.out.println(s.peek());
        s.PrintStack();
           
    }
}


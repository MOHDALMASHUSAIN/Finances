package CH9Queue;

import java.util.Stack;

class Queue{
        private static int maxSize ;
        private static int front ;
        private static int rear ;
        
        private static Stack<Integer>Queuestack;

        public Queue(int capacity){
            this.maxSize = capacity;
            this.front = 0;
            this.rear = -1;
            this.Queuestack = new Stack<>();

        }
        public void offer(int value){
            if(rear<maxSize){
                ++rear;
                Queuestack.push(value);
                System.out.println("Element stored is::" + value);
            }
            else{
                System.out.println("Queue Overflow");
            }

        }
        static int poll(){
            if(front < rear){

                Stack<Integer>temp = new Stack<>();
                for (int i = 0; i < Queuestack.size()-1; i++) {                                        
                int element = temp.push(Queuestack.pop());
                
                }
                 front++;
                Queuestack.pop();
                for (int i = 0; i < temp.size(); i++) {
                    Queuestack.push(temp.pop());
                }               
                System.out.print("Removed Element : " );
                return 1;
            }            
            else{
                System.out.println("Queue Underflow");
                return -1;
            }        
        }
        static void printQueue(){
            if(!isEmpty()){
                System.out.println("Queue ELEMENTS ARE : ");
                for(int i =front;i<=rear;i++){
                System.out.print(Queuestack.elementAt(i) + "  ");
            }
            }
            else{
                System.out.println("Queue is empty....");
            }
        }
        private static boolean isEmpty() {
            return false;
        }
        
        

        
    }        



public class Class1_hwQ2StackImplementation {
    public static void main(String[] args) {
        Queue myQueue = new Queue(3);
        myQueue.offer(20);
        myQueue.offer(60);
        myQueue.offer(80);
         System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());
        // System.out.println(myQueue.peek());
    //     // System.out.println(myQueue.poll());
    //     System.out.println(myQueue.isEmpty());
    //     System.out.println(myQueue.isFull());
//         myQueue.printQueue();
        
    }
    
}

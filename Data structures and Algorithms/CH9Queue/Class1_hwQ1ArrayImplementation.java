package CH9Queue;

class Queue{
        private static int maxSize ;
        private static int front ;
        private static int rear ;
        
        private static int []QueueArray;

        public Queue(int capacity){
            this.maxSize = capacity;
            this.front = 0;
            this.rear = -1;
            this.QueueArray = new int[capacity];

        }

        public void offer(int value){
            
            // overflow 
            if(rear< maxSize){
                QueueArray[++rear] = value;
                System.out.println("Element Stored : " + value );
            }
            else{
                System.out.println("Queue Overflow");
            }
        }

        static int poll(){
            if(front < rear){
                int element = QueueArray[front++];
                System.out.print("Removed Element : " );
                return element;
            }
            else{
                System.out.println("Queue Underflow");
                return -1;
            }
        }

        static int peek(){
            if(front <= rear){
                int element = QueueArray[front];
                System.out.print("Peek Element is : ");
                return element;
            }
            else{
                System.out.println("Queue Underflow");
                return -1;
            }
        }

        static boolean isEmpty(){
            return (front>rear && rear<0);
        }

        static boolean isFull(){
            return ( rear== maxSize-1);
        }
        static int size(){
            return rear-front+1;
        }

        static void printQueue(){
            if(!isEmpty()){
                System.out.println("Queue ELEMENTS ARE : ");
                for(int i =front;i<=rear;i++){
                System.out.print(QueueArray[i] + "  ");
            }
            }
            else{
                System.out.println("Queue is empty....");
            }
        }
    }
public class Class1_hwQ1ArrayImplementation {
    public static void main(String[] args) {
        Queue myQueue = new Queue(3);
        myQueue.offer(20);
        myQueue.offer(60);
        myQueue.offer(80);
         System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());
         System.out.println(myQueue.peek());
    //     // System.out.println(myQueue.poll());
    //     System.out.println(myQueue.isEmpty());
    //     System.out.println(myQueue.isFull());
       myQueue.printQueue();
    }
}
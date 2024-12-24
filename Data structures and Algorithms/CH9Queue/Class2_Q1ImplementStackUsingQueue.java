package CH9Queue;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
       private static Queue<Integer> queue1;
        private static Queue<Integer> queue2;

        public Stack(){
           this.queue1 = new LinkedList<>();
           this.queue2 = new LinkedList<>();

        }
        public void push(int value){
            queue1.offer(value);
        }
        public int pop(){
            while (queue1.size()>1) {
                queue2.offer(queue1.poll());               
            }
            int element = queue1.poll();
            Queue<Integer> temp = queue1;
            queue1=queue2;
            queue2 = temp;
            return element;
        }
        public static int peek(){
            int element=0;
            while (!queue1.isEmpty()) {
                 element =queue1.poll();
                queue2.offer(element);               
            }
             Queue<Integer> temp = queue1;
            queue1=queue2;
            queue2 = temp;
            return element;
      
           
        }





    }

public class Class2_Q1ImplementStackUsingQueue {
    public static void main(String[] args) {
        
    }
}

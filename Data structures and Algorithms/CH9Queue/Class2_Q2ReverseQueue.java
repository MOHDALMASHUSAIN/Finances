package CH9Queue;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


public class Class2_Q2ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(125);
        queue.offer(4);
        queue.offer(5);
        queue.offer(1);
        int k = queue.size();
        Queue<Integer>tempQueue1 = new LinkedList<>();
        Queue<Integer>tempQueue2 = new LinkedList<>();
        for (int i = 0; i < k; i++) {            

           while(queue.size()!=1) {
            tempQueue1.offer(queue.poll());            
           }

           tempQueue2.offer(queue.poll());
           while (!tempQueue1.isEmpty()) {
            queue.offer(tempQueue1.poll());           
           }
        }     
        
         System.out.println(tempQueue2);
}
    
}

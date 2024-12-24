package CH9Queue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Class3_Q1Combinations {
    public static void main(String[] args) {
        // No of Combinations = 2*n
        int number = 123;
        //String str = new Integer(no).toString();
         String str =  new Integer(number).toString(number);
         Queue<Character> queue = new LinkedList<>();
         for (int i = 0; i < str.length(); i++) {
           queue.offer(str.charAt(i));            
         }
         Stack<Character>tempStack= new Stack<>();
         int n = queue.size();
         for (int i = 0; i<n; i++) {
            queue.offer(queue.poll());
            System.out.println(queue);
            while (!queue.isEmpty()) {
                tempStack.add(queue.poll());                
            }  
                 System.out.println(tempStack);    
 
         }
         

    }
    
}

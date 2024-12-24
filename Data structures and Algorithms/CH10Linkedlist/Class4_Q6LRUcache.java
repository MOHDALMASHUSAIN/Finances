package CH10Linkedlist;
import java.util.Stack;

public class Class4_Q6LRUcache {
    public static Stack<Integer>tempstack = new Stack<>();
    static void Add(Stack<Integer>stack,int n){
     while (stack.size()!=1) {
        tempstack.push(stack.pop());
     }
     stack.pop();
     while (!tempstack.isEmpty()) {
        stack.push(tempstack.pop());
     }
     stack.push(n);
     System.out.println(stack);
    }
    
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.add(28);
        stack.add(554);
        stack.add(101);
        Add(stack, 133);
      
    }
}

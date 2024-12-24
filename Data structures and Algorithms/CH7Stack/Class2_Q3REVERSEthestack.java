package CH7Stack;
import java.util.Scanner;
import java.util.Stack;
public class Class2_Q3REVERSEthestack {
    static void Mystack(Stack stack){

        Stack<Integer>temp1 = new Stack<>();
        Stack<Integer>temp2 = new Stack<>();

        while (!stack.isEmpty()){
        temp1.push((Integer) stack.pop());        
        }
        while (!temp1.isEmpty()) {
        temp2.push(temp1.pop());        
        }
        while (!temp2.isEmpty()) {
        stack.push(temp2.pop());       
        }
        System.out.println("reversed stack is ::" + stack);
    }
    public static void main(String[] args) {
         Stack <Integer> stack = new java.util.Stack<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
        stack.push(sc.nextInt());
      }
     
      Mystack(stack);
      sc.close();              
      }
    
    }
    


package CH7Stack;
import java.util.Scanner;
import java.util.Stack;

public class Class3_Q5MaXandMiN {
    public static void main(String[] args) {
    Stack <Integer> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
      stack.push(sc.nextInt());
      }


      /*                      // Minimum Element//

      int value = Integer.MAX_VALUE;
      for (int i = 0; i < stack.size(); i++) {
        if(stack.elementAt(i)<=value){
            value = stack.elementAt(i);
        }
        
      }
       System.out.println("the minimum element is ::" + value);
       */

      int value = Integer.MIN_VALUE;
      for (int i = 0; i < stack.size(); i++) {
        if(stack.elementAt(i)>=value){
            value = stack.elementAt(i);
        }
        
      }
       System.out.println("the maximum element is ::" + value);
    }    
}

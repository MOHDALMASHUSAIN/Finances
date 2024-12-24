package CH7Stack;
import java.util.Scanner;
import java.util.Stack;

public class Class3_Q3Sort {
    static Stack<Integer> fun(Stack OS){
        Stack<Integer>TS = new Stack<>();
        int current = OS.pop();
        while (!TS.empty() && current >TS.peek()) {
            OS.push(TS.pop());
        }    
            TS.push(current);
             return TS;
            
        }
       
    

    public static void main(String[] args) {
        Stack <Integer> OS = new Stack<>();
        Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
     OS.push(sc.nextInt());
      }

       fun(OS);
        

    }

}



      /*   USING NESTED LOOP
      Stack <Integer>stack2 = new Stack<>();
      int value = Integer.MIN_VALUE;
      for (int i = 0;  i<stack1.size(); i++) {
       for (int j = 0; j< stack1.size(); j++) {
        if(stack1.elementAt(i)>=value){
          value =stack1.elementAt(i);
        }
        stack2.push(value) ;
        stack1.push(Integer.MAX_VALUE);
       }
      }
      System.out.println("sorted stack" + value);
      */
      
      /* 
     Stack <Integer>stack2 = new Stack<>();
     stack2.push(stack1.peek());
     for (int i = 0; i < stack1.size()-1; i++) {
       if (stack1.peek()<stack2.peek()){
        stack2.push(stack1.peek());
       }
       else if (stack1.peek()>stack2.peek()) {
        while (stack1.peek()>stack2.peek()) {
          stack1.push(stack2.peek());
          
        }
        
       }
       System.out.println(stack2);

     }
     */

    
  
    


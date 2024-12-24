package CH7Stack;

import java.util.Scanner;
import java.util.Stack;


public class Class2_Q1findkthelemnt {
    public static void main(String[] args) {
      Stack <Integer> findkthelemnt = new Stack<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
        findkthelemnt.push(sc.nextInt());
      }
      System.out.println("Enter the value  k");
      int k  =sc.nextInt();
      for (int i = 0; i <N-k; i++) {
        findkthelemnt.pop();
      }
      System.out.println(findkthelemnt.peek());     
             
    }
    
}

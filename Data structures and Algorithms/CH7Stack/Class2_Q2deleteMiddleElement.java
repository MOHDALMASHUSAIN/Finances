/* 
package CH7Stack;

import java.util.Scanner;
import java.util.Stack;

public class Class2_Q2deleteMiddleElement {
    public static void main(String[] args) {
        Stack <Integer> deleteMiddleElement = new Stack<>();
        Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
       deleteMiddleElement.push(sc.nextInt());
      }

      Stack <Integer> Temporary = new Stack<>();
      
      for (int i = 0; i<N/2; i++) {
        Temporary.push(deleteMiddleElement.pop());
      }
      deleteMiddleElement.pop();
      for (int i = 0; i<Temporary.size(); i++) {
        deleteMiddleElement.push(Temporary.pop());
      }
      for (int i = 0; i<deleteMiddleElement.size();i++){  
        System.out.print(deleteMiddleElement.elementAt(i) + " ");
      }
    }
    
}

     //...// problem coming when poping element from temp. because i<tempo.size is dynamic 
*/
package CH7Stack;
import java.util.Scanner;
import java.util.Stack;

public class Class2_Q2deleteMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> deleteMiddleElement = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of elements in the stack: N");
        int N = sc.nextInt();

        System.out.println("Now push the elements onto the stack:");
        for (int i = 0; i < N; i++) {
            deleteMiddleElement.push(sc.nextInt());
        }

        Stack<Integer> temporary = new Stack<>();

        // Move the first half of elements to temporary stack
        for (int i = 0; i < N / 2; i++) {
            temporary.push(deleteMiddleElement.pop());
        }

        // Skip the middle element
        deleteMiddleElement.pop();

        // Push back the elements from temporary to the original stack
        while (!temporary.isEmpty()) {
            deleteMiddleElement.push(temporary.pop());
        }

        // Print the final stack
        System.out.println("Stack after deleting middle element:");
        for (int i = 0; i < deleteMiddleElement.size(); i++) {
            System.out.print(deleteMiddleElement.elementAt(i) + " ");
        }
        sc.close();
    }
}

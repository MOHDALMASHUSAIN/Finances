package CH7Stack;
import java.util.Stack;

public class Class2_Q4NXTgreaterElement {
    public static void main(String[] args) {
        int arr[] ={4,2,10,7,11};
        
        stack.push(arr[0]);
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] =-1;
        }
             
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            while (!stack.empty() && arr[stack.peek()] <current) {
                arr[stack.peek()] = current;
                
            }
            stack.push(i);
                     
        }








        
    }
    
}

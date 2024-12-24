package CH7Stack;

import java.util.Stack;

public class Class1_Intro {
    public static void main(String[] args) {
        Stack<Integer>MyStack = new Stack<>();
        //Stack Follows First INN,last OUT

        MyStack.push(30);
        MyStack.push(20);
        MyStack.push(41);
        MyStack.push(21);
        MyStack.push(43);
       System.out.println(MyStack.pop());
       System.out.println(MyStack.peek());
       System.out.println(MyStack.size());
       System.out.println(MyStack.capacity());
        System.out.println(MyStack.elementAt(2));
    }
    
}

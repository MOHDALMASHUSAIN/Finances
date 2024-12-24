package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class4_Q5SwapNodesinPair {
    static void SwapNodesinPair(LinkedList<Integer>list){     
        for (int i = 0; i < list.size(); i=i+2) {
            int temp = list.get(i);
           list.set(i, list.get(i+1));
           list.set(i+1, temp);
        }
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sorted elements(enter -1 to stop)");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element==-1) {
               break; 
            } 
            list1.add(element);           
        }
        SwapNodesinPair(list1);
        sc.close();
        
    }
}

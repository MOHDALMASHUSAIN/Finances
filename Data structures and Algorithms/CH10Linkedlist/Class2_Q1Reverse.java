package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class2_Q1Reverse {
    public static void main(String[] args) {
         LinkedList<Integer>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements(enter -1 to stop)");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element==-1) {
               break; 
            } 
            list.add(element);           
        }
        for (int i = 0,j=list.size()-1;i<list.size()/2 ; i++,j--) {
            int temp =list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
        }
        System.out.println("reversed linkedlist is ::" + list);
      sc.close();
    }
    
}

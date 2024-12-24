package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class2_Q5firstlastnodeSame {
    static boolean checkfirstNlast(LinkedList<Integer>list){        
            if ( list.getFirst()==list.getLast()){
                System.out.println("Same ");
                     return true;
            } 
            else{
                System.out.println("not same");
            }          
         
        return false;           
    }
    
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
        checkfirstNlast(list);
        sc.close();
    }
    
}

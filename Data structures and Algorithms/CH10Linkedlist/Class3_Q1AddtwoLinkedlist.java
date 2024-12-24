package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class3_Q1AddtwoLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        LinkedList<Integer>list2 = new LinkedList<>();  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of Linkedlist1(-1 to stop)");
        int element1 =0;
        while (true) {
            element1=sc.nextInt();
            if (element1==-1) {
                break;
            }
            else{
                list1.add(element1);
            }                    
        }
        System.out.println("enter the elements of Linkedlist1(-1 to stop)");
        int element2=0;
        while (true) {
            element2=sc.nextInt();
            if (element2==-1) {
                break;
            }
            else{
                list2.add(element2);
            }                    
        }
        
        int num1 =0;
       // breaking into numbers
       for (int i = 0;i<list1.size();i++){
        num1 =num1*10+list1.get(i);
       }
       int num2 =0;
       for(int i =0;i<list2.size();i++){
        num2 = num2*10+list2.get(i);
       }
       int sum = num1+num2;
       System.out.println(sum);
       for(int i =list3.size()-1;i>=0;i--){
        list3.add(i, sum%10);
        sum = sum/10;
    }
    System.out.println(list3);
    

 sc.close();
       
    }
}

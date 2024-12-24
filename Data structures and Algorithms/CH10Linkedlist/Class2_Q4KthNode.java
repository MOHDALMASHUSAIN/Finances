package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class2_Q4KthNode {
    static void KthNode(LinkedList<Integer> list, int k) {
        if (k <= list.size()) {
            System.out.println("kth element from start::" + list.get(k - 1));
            System.out.println("Kth element from last ::" + list.get(list.size() - k));
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements (enter -1 to stop):");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element == -1) {
                break; 
            }
            list.add(element);
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        KthNode(list, k);
        sc.close();
    }
}

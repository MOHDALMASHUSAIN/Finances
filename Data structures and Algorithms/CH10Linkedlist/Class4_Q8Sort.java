package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q8Sort {
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

        // Perform selection sort on the linked list
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part of the list
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

        System.out.println("Sorted Linked List: " + list);
    }
}

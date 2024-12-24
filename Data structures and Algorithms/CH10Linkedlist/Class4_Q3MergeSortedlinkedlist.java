package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q3MergeSortedlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sorted elements for the first list (enter -1 to stop):");
        readLinkedList(sc, list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("Enter sorted elements for the second list (enter -1 to stop):");
        readLinkedList(sc, list2);

        LinkedList<Integer> newLL = mergeSortedLists(list1, list2);

        // Display the merged sorted linked list
        System.out.println("Merged Sorted Linked List:");
        for (Integer value : newLL) {
            System.out.print(value + " ");
        }
    }

    static void readLinkedList(Scanner sc, LinkedList<Integer> list) {
        int element;
        while (true) {
            element = sc.nextInt();
            if (element == -1) {
                break;
            }
            list.add(element);
        }
    }

    static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

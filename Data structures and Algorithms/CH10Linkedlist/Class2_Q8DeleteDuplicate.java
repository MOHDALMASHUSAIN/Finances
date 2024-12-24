package CH10Linkedlist;

import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Class2_Q8DeleteDuplicate {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements (-1 to stop)");
        Scanner sc = new Scanner(System.in);
        int element = 0;

        while (true) {
            element = sc.nextInt();
            if (element == -1) {
                break;
            }
            list.add(element);
        }

        Set<Integer> uniqueElements = new HashSet<>();
        LinkedList<Integer> nonDuplicateList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);

            if (uniqueElements.add(currentElement)) {
                // The element was not present in the set (non-duplicate)
                nonDuplicateList.add(currentElement);
            }
        }

        
        System.out.println("Linked list with non-duplicate elements:");
        for (int elementInList : nonDuplicateList) {
            System.out.print(elementInList + " ");
        }

        sc.close();
    }
}

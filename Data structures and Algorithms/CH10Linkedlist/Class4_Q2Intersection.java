package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q2Intersection {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Input for the first linked list
        System.out.println("Enter elements for the first linked list (enter -1 to stop):");
        readLinkedList(sc, list1);

        // Input for the second linked list
        System.out.println("Enter elements for the second linked list (enter -1 to stop):");
        readLinkedList(sc, list2);

        // Find and display intersection
        displayIntersection(findIntersection(list1, list2));
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

    static void displayIntersection(Integer intersection) {
        if (intersection != null) {
            System.out.println("Intersection found at node with value: " + intersection);
        } else {
            System.out.println("No intersection found.");
        }
    }

    static Integer findIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    return list1.get(i); // Assuming only one intersection point
                }
            }
        }
        return null; // No intersection found
    }
}


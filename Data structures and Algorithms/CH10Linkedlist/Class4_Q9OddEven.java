package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q9OddEven {

    static void printOddEven(LinkedList<Integer> list) {
        System.out.print("Odd Elements: ");
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }

        System.out.println();

        System.out.print("Even Elements: ");
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements (enter -1 to stop)");
        int element = 0;

        while (true) {
            element = sc.nextInt();
            if (element == -1) {
                break;
            }
            list.add(element);
        }

        printOddEven(list);
    }
}

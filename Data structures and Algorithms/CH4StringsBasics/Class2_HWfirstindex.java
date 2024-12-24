package CH4StringsBasics;

import java.util.Scanner;

public class Class2_HWfirstindex {
    static int firstIndex(String n, char a) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == a) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
  System.out.println("enter the characte r");
        char a = sc.next().charAt(0);

        System.out.println();
       
        int result = firstIndex(str,a);

        if (result != -1) {
            System.out.println("First index  is: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

package CH2ArrayMedium;
import java.util.Scanner;

public class Class2_HWQ16firstNlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("elements of the array is:: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("give the target element");
        int k = sc.nextInt();

        // Find the first occurrence
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                firstIndex = i;
                break;
            }
        }
        int lastIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == k) {
                lastIndex = i;
                break;
            }
        }
        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("first and last index of target element is::" + firstIndex + " " + lastIndex);
        } else {
            System.out.println("Target element not found in the array.");
        }
        sc.close();
    }
}

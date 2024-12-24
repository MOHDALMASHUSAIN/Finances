package CH3OOPs.FUNCTION;

import java.util.Scanner;

public class Q20ARRAYusingFunction {
    static boolean isSorted(int arr[], int m) {
        for (int j = 0; j < m - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = isSorted(arr, n);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
        sc.close();
    }
}

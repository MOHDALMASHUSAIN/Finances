package CH2ArrayMedium;
import java.util.Arrays;
import java.util.Scanner;

public class CLass3_HWQ8KthMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Check if K is within valid range
        if (k > 0 && k <= n) {
            System.out.println("The " + k + "th maximum element is: " + arr[n - k]);
        } else {
            System.out.println("Invalid value of K.");
        }

        sc.close();
    }
}
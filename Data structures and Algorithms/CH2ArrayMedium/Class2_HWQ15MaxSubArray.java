package CH2ArrayMedium;

import java.util.Scanner;

public class Class2_HWQ15MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int start = 0, end = 0;

        // Nested loop to consider all subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                // Update maxSum if currentSum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum sum of subarray: " + maxSum);
        System.out.println("Subarray with maximum sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

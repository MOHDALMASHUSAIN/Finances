package CH2ArrayMedium;
import java.util.Scanner;

public class Class2_HWQ14SubArraySumisK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with minimum possible value
        int start = 0, end = 0;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int currentSum = 0; // Reset current sum for each new starting index
            
            for (int j = i; j < n; j++) {
                currentSum += arr[j]; // Add current element to the current sum
                
                // Update maxSum if current sum is greater
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }
        
        System.out.println("Maximum sum of subarray: " + maxSum);
        System.out.print("Subarray with maximum sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}

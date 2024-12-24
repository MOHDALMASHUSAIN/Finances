package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ2removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        } 
        
        System.out.print("Array without duplicates: ");
        for(int i = 0; i < arr.length; i++) {
            // Check for duplicates in the remaining elements
            for(int k = i + 1; k < arr.length; k++) {
                if(arr[i] == arr[k]) {
                    arr[k] = -1; // Mark duplicates as -1
                }
            }
            // Print only non-marked elements
            if(arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}

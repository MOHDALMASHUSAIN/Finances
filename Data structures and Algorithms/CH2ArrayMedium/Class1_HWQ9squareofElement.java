package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ9squareofElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array1");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("The array is: ");
        for (int k = 0; k < n; k++) {
            arr1[k] = sc.nextInt();
        }
         for (int k = 0; k < n; k++){
            System.out.println(arr1[k]*arr1[k]);
         }

        sc.close();
    }
}

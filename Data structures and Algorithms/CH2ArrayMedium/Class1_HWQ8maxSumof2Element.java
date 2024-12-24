package CH2ArrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class Class1_HWQ8maxSumof2Element {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array1");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("The array is: ");
        for (int k = 0; k < n; k++) {
            arr1[k] = sc.nextInt();
        }

        Arrays.sort(arr1);
        
        System.out.println(arr1[(arr1.length)-1]+arr1[(arr1.length)-2]);
        


        sc.close();
    }
}

package CH2ArrayMedium;

import java.util.Arrays;
import java.util.Scanner;

public class Class1_HWQ11KthMin {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter the no of elements of the array");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.print("elements of the array is:: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // sort the array 
       Arrays.sort(arr);
       System.out.println("enter the Kth that to be the smallest ");
       int k = sc.nextInt();
           int  element= arr[k-1];
             System.out.println("kth smallest element is :: " +element);
         
       
        sc.close();
    }
}

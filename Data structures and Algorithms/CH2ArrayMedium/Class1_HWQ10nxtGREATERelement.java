package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ10nxtGREATERelement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array1");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("The array is: ");
        for (int k = 0; k < n; k++) {
            arr1[k] = sc.nextInt();
        }
        // //  for(int i =0;i<n;i++){
        // //     for(int j = i+1;j<arr1.length;j++){
        // //      if(arr1[i]<arr1[j]) {
        // //         arr1[i]=arr1[j];
               
               
        // //      }
        // //       System.out.println(arr1[i]);
        // //         break;

        //     }
            
        //  }

        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr1[j] > arr1[i]) {
                    nextGreater = arr1[j];
                    break;
                }
            }
            System.out.print(nextGreater + " ");
        }

        sc.close();


    }
}

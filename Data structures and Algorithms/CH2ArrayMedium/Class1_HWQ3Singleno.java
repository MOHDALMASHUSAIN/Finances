package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ3Singleno {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("The array is: ");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        
        
        for(int i= 0;i<arr.length;i++){
            for(int k = i+1;k<arr.length;k++){
                if(arr[i]==arr[k]){
                    arr[k]=-1 ;arr[i]=-1;

                }
                

            }
            if(arr[i]!=-1){
                System.out.println("Single elements are::"+arr[i]+" ");
            }
            
        }
        sc.close();
    }
}

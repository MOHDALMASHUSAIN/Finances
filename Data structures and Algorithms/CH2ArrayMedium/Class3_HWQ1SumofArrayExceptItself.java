package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ1SumofArrayExceptItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements in tha array");
         int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
         
        for (int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
               if(i!=j){
                   count = count+arr[j];
               }
            }
            System.out.print(count + " ");
           }
           sc.close();

    }
}

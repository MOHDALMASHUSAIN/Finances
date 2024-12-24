package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ4plusOne {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("The array is: ");
        for (int k = 0; k < n; k++) {
            arr[k] =sc.nextInt();
        }
          int num = 0;
          for (int i = 0;i<arr.length;i++){
             num =num*10+arr[i]; 
           
            
          }
          num = num+1;
         // int num = num%10
        for(int i=arr.length-1;i>=0;i--)
        {
            int rem =num%10;
            arr[i]=rem;
            num=num/10;
        }
        for(int i :arr){
            System.out.print(i);
        }

     sc.close();
    }
}

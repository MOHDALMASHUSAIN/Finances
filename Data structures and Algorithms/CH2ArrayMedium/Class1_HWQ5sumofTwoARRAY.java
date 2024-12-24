package CH2ArrayMedium;

import java.util.Scanner;

public class Class1_HWQ5sumofTwoARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter number of elements of  array1");
        int n = sc.nextInt();
        int arr1 []= new int[n];
        System.out.println("enter the elements of array1");
        for (int i = 0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter number of elements of  array2");
        int m = sc.nextInt();
        int arr2 []= new int[m];
        System.out.println("enter the elements of array2");
        for (int i = 0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
       
       int num1 =0;
       // breaking into numbers
       for (int i = 0;i<arr1.length;i++){
        num1 =num1*10+arr1[i];
       }
      int Sum1 = num1;
      int num2= 0;
      for(int i= 0;i<arr2.length;i++){
         num2 =num2*10+arr2[i];
      }   
      int Sum2= num2;
     int add = Sum1+Sum2;
        for(int i =arr1.length-1;i>=0;i--){
            arr1[i]=add%10;
            add = add/10;
        }
        for(int i :arr1){
            System.out.print(i);
        }

     sc.close();
    }
}

package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ2productofArrayexceptItself {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            int product = 1;
            for(int j =0;j<arr.length;j++){
                if(i!=j){
                    product =product*arr[j];
                }
            }
            System.out.println("product of array except itself :: " + product+" ");

        }
        sc.close();
    

    }
    
}

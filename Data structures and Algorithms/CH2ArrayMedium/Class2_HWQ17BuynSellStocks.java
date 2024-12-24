package CH2ArrayMedium;

import java.util.Scanner;

public class Class2_HWQ17BuynSellStocks {
  

    public static void main(String[] args) {
          Scanner sc  =new Scanner(System.in);
        System.out.println("enter the no of elements of the array");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.print("elements of the array is:: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
         int count =0;    
           int buy=0 ;int sell =0;
        for( int  i= 0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>count){
                 count =arr[j]-arr[i]; 
                 buy =i;
                 sell =j;
                }
                  
            }  
        }
        System.out.println("buy at day ::"+(buy+1)+ " "+ "Sell at day::"+(sell+1));

        sc.close();

    }
}

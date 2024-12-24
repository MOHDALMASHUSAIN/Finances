package CH5Recursion;

import java.util.Scanner;
// Q--> thoda sa modify.
public class CLass4_HWQ2fibbonacci {
    static int k = 0;

    static void fibbonacci(int first , int second,int n){
      if(k==n){
          return;
      }
     int sum = first +second;
     //arr{sum};
     System.out.print(sum +" ");
     k++;
     first = second;
     second =sum; 
     fibbonacci(first, second, n);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("put no of elements of fibbonacci is :: k");
        int n = sc.nextInt();
        System.out.print(0 +" " + 1+" ");
        fibbonacci(0, 01,n);
        sc.close();
    }
}
                      using branching

package CH5Recursion;

import java.util.Scanner;

public class Class1_HWQ1EvenSum {
   static int k =0;
    static void evensum(int n,int count ){
        if(count>n/2){
            return;
        }
        k +=2*count;
        evensum(n, count+1);
        
    }
    
    public static void main(String[] args) {
        System.out.println("enter the upto which all even nos. will b added");
          Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        evensum(n, 1);
       // System.out.println();
       System.out.println(k);
       sc.close();
    }
}

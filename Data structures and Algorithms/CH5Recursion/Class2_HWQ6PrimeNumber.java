package CH5Recursion;

import java.util.Scanner;

public class Class2_HWQ6PrimeNumber {
          static int a;
    static boolean Prime(int n,int a){
   if(a==n ){
    return true ;
   }


    if( n%a==0){
        return false ;
    }
    return Prime(n,a+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(Prime(n,2)==true){
            System.out.println("is a prime ");
        }
        else{
            System.out.println("not a prime ");
        }
        sc.close();
    }
    
}

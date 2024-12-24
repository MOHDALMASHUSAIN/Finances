package CH5Recursion;

import java.util.Scanner;

public class Class2_HWQ4ApalindromeNumber {
    static int  rev =0;
    static boolean palindrome(int n){
        if(n/10<=0){           
           return true ;
        }
        
        int rem = n%10;
        rev = rev*10+rem;
        if(rev!=n){
            return false;
        }
       
       return palindrome(n/10);
        
        
    }
    public static void main(String[] args) {
        System.out.println("enter the Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(palindrome(num)==true){
            System.out.println("is a palindrome");
        }
        else{
        System.out.println("not a palindrome");
        }
        sc.close();


    }
}

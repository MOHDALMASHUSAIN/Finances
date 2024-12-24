package CH5Recursion;

import java.util.Scanner;



public class Class1_HWQ2printDigit {
    static void digit(int n){
        if(n/10==0){
            System.out.println(n%10 + " ");
            return;
        }
        digit(n/10);
        System.out.println(n%10 + " ");
    }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr a number ");
    int number = sc .nextInt();
    System.out.println("Digit::");
    digit(number);
    sc.close();
     


   } 
}

package CH5Recursion;

import java.util.Scanner;

public class Class1_CWQ3table {
    static void table(int n,int count){
    if(count==11){
        return;
    }
    System.out.println(n*count);
    table(n, count+1);
    }

    public static void main(String[] args) {
        System.out.println("enter the value of the number whose table you want");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       table(n, 1); 
       sc.close();
    }
}

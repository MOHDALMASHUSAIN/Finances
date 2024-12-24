package CH5Recursion;

import java.util.Scanner;

public class Class2_HWQ5cPowerof4 {
    static boolean Powerof4(int n){
   if(n==1){
    return true;
   }
    if(n%4!=0){
        return false;
    }
      return Powerof4(n/4);

    }
    public static void main(String[] args) {
    System.out.println("enter the number  ");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    if(Powerof4(n)==true){
        System.out.println("power of 4");
     
    }
    else{
        System.out.println("not power of 4");
    }
    sc.close();
    }
}

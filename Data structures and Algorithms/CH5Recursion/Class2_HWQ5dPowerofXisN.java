package CH5Recursion;

import java.util.Scanner;

public class Class2_HWQ5dPowerofXisN {
  static int n;
    static boolean PowerofXisN(int X){
        if(X==1){
            return true;
        }

       if(X%n!=0){
          return false;
       }
      return PowerofXisN(X/n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put the value of x");
        int X=sc.nextInt();
        int n = sc.nextInt();
          if(PowerofXisN(X)==true){
            System.out.println("Power is");
          }
        sc.close();
    }
}

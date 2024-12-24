package CH4StringsBasics;

import java.util.Scanner;

public class Class1_Basics {
   
    public static void main(String[] args) {
         String str = "This is 1st class of string.V r learnig basics of it";
        System.out.println(str);
          str += "abs";
          System.out.println(str);

        Scanner sc = new Scanner(System.in);

        String ptr = sc.nextLine() ;
        System.out.println(ptr);

        String ktr = sc.next();
        System.out.println(ktr);   
        sc.close(); 
    }    
}
   
      //NOTES 
      /* 
      String mempry can be measured using char.
      1 char = 2 byte
      1 int = 4 byte 
      
      */

package CH4StringsBasics;

import java.util.Scanner;

public class Class2_HWcountVowel {
    public static void main(String[] args) {
       // String str = "aeiou";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string name");
        String str1 = sc.nextLine();
      int count  = 0;
      for (int i = 0;i<str1.length();i++){
        if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {

            count +=1;
        }
      }
      System.out.println(count);
      
    }   
}
   // time complexity -O(n)
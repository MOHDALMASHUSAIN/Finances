package CH4StringsBasics;
import java.util.Scanner;

public class Class2_Palindromecheck {
  static int checkpalindrome(String str)
  {
        for (int s= 0,e=str.length()-1;s<str.length()/2;s++,e--){
               if(str.charAt(s)!= str.charAt(e))
               {
                return -1;
               }
        }
        return 1;
 }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
            if(checkpalindrome(str)==-1){
                System.out.println("not A palindrome");
            }
    else{
        System.out.println("string is a palindrome ");
    }
    sc.close();
    }    
}
 // time complexity -O(n)
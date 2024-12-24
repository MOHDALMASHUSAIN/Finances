package CH4StringsBasics;

import java.util.Scanner;

public class Class3_HwUpperCase {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the string");
    String ptr = sc.nextLine();
    String str =" ";
    for (int i = 0;i<ptr.length()-1;i++){
        if(ptr.charAt(i)>=65 && ptr.charAt(i)<=90){
            str = str+ptr.charAt(i);
        }}
        for (int i = 0;i<ptr.length()-1;i++){
        if( ptr.charAt(i)>=97 && ptr.charAt(i)<=122){
       String Str2= ptr.charAt(i)-'a'+'A';
        }
    }

        sc.close();
    }
    
}

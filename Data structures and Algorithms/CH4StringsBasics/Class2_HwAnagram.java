package CH4StringsBasics;

import java.util.Scanner;

public class Class2_HwAnagram {
    static int checkAnagram(String str1,String str2){
        if(str1.length() ==str2.length()){
        for (int s= 0;s<str1.length()-1;s++){
           
        for (int e=0;e<str2.length();e++){
               if(str1.charAt(s)!= str2.charAt(e)){
                return -1;
               }
                 
               }}
             return 1;
            }
        return 0;}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string1");
        String str1 = sc.nextLine();
         System.out.println("enter thestring2");
        String str2 = sc.nextLine();
       
        if(checkAnagram(str1,str2)==-1){
            System.out.println("not  Anagram");
        }
else{
    System.out.println("string is a Anagram ");
}
sc.close();
    }
}

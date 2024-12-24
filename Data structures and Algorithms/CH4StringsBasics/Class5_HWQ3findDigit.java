package CH4StringsBasics;

import java.util.Scanner;

public class Class5_HWQ3findDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char arr[] =str.toCharArray();
        System.out.println("digit of string is");
        for(int i= 0;i<str.length();i++){
            if(Character.isDigit(arr[i])){
             System.out.println(arr[i]);
            }
        }
        sc.close();

    }
}

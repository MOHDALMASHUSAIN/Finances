package CH4StringsBasics;

import java.util.Scanner;

public class Class2_ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String ptr = sc.nextLine();
            
                  //APPROACH------ 1 . using empty string 
/* 
            String  REV = " ";
            for (int i = ptr.length()-1;i>=0;i--){
             REV += ptr.charAt(i);
            }
            System.out.println("Reverse of string is ::"+REV);
*/
                // APPROACH----------2
                char arr[] = ptr.toCharArray();
                 for (int s =0,e=arr.length-1;s<arr.length/2;s++,e--){
                    char temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                 }
                 for ( char  getReverse : arr  ){
                    System.out.print(getReverse+ " ");
                 }
                            

    }
    }

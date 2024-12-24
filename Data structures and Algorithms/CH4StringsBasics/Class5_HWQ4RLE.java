package CH4StringsBasics;

import java.util.Scanner;

public class Class5_HWQ4RLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String Str = sc.nextLine();

        /* NAIVE APPROACH
       char arr[] = Str.toCharArray();
       for (int i = 0;i<arr.length-1;i++){
        int count =1;
         for (int j = i+1;j<arr.length;j++){
           if(arr[i]==arr[j]){
            count ++;
            i=j;
           }
         }
        
          System.out.print(arr[i]+" "+ count+" ");
      }
      */

                /*   TWO POINTER METHOD
     
            char arr[] = Str.toCharArray();
            int count = 1;
    
            for (int i = 0, j = i + 1; i < arr.length; i++, j++) {
                if (j < arr.length && arr[i] == arr[j]) {
                    count++;
                } 
                else {
                    System.out.print(arr[i] + "" + count + " "); // Print the current character and its count
                    count = 1; // Reset count for the next character
                }
            }
        
    
    */
      sc.close();


    }
}

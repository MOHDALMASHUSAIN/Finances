package CH4StringsBasics;

import java.util.Scanner;

public class Class5_HWQ1ImplementTrim {
    public static void main(String[] args) {
        String ptr ="";
        Scanner sc= new Scanner(System.in);
            System.out.println("enter the string ");
           String str = sc.nextLine();
        
            char arr[] =str.toCharArray();
            int first =0;
            for(int i = 0;i<str.length();i++){
               if(arr[i] !=' '){
                 first =i;
                 break;
               }}
              // first;
              int last =0; 
               for(int j=str.length()-1;j>=0;j--){
                if(arr[j]!=' '){
                    last = j;
                    break;   
                }
               }
              // char arrfinal[] = new char[last-first +1];
               for(int i =first;i<=(last);i++){
             // System.out.print( arr[i]);
             ptr +=arr[i];
               }
               System.out.println("trimmed string is::" + ptr);
               sc.close();
                    
    }}
  
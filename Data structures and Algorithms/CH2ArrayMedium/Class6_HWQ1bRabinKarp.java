package CH2ArrayMedium;

import java.util.Scanner;
///O(n-m)m
public class Class6_HWQ1bRabinKarp {
   static long hashcod(String str){
    long hascode=0;
    for(int i =0;i<str.length();i++){
     hascode += str.charAt(i)*Math.pow(i*2+1, 3);
    }
    return hascode;
   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the string s");
       String s = sc.nextLine();
       System.out.println("enter the patern : patt");
       String patt = sc.nextLine();
       long hashcodeofpatt = hashcod(patt);
       for(int i = 0;i<s.length()-patt.length();i++){
        String subString =s.substring(i, i+patt.length());
        long hascodeofstring = hashcod(subString);
        if (hascodeofstring==hashcodeofpatt  && (subString.equals(patt))) {
            System.out.println("index of repeating pattern :: " + i);
          
            
        }
       
       }
  sc.close();
        
    }
}

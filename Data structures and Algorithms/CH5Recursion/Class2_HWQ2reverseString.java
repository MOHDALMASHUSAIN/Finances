package CH5Recursion;

public class Class2_HWQ2reverseString {
   static String reverse="";
  
    static void rev( String OG,int i ){
        if(i<0){
            System.out.println("reverse of string is::"+ reverse);
            return ;
        }

      
        reverse += OG.charAt(i);
         rev(OG, i-1); 

    }
    public static void main(String[] args) {
        String OGh="almas hudsaij";
     rev(OGh,OGh.length()-1);
    }
}

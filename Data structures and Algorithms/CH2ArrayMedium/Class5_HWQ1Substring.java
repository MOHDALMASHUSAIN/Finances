package CH2ArrayMedium;

        /////////// FINDING SUBSTRING USING RECURSION////////////

public class Class5_HWQ1Substring {
    static String Substring(String str,int k,int n){
     if(k==str.length()-1){
         System.out.println(str.charAt(k));
        return str ; 
     }
    
    str.substring(k, n);
    return Substring(str.replace(str.substring(k),""),k, n);      
    }
    public static void main(String[] args) {
        String str = "mohd almas husain";
        


    }
    
}

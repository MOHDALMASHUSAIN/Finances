//Question - String -"Hello_User". find all the substring using function.

package CH4StringsBasics;
public class Class1_hw1 {
 static void getSubstrings(String str){
     for (int i = 1; i<=str.length();i++){
        System.out.println(str.substring(0,i));
     }
 }
    public static void main(String[] args) {
      
        getSubstrings("Hello_User");

    }
}

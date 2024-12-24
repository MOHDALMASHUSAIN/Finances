package CH4StringsBasics;

public class Class1_InbuiltMethod {
    public static void main(String[] args) {
        String str = "I am learning Chapter 3 (Strings)";
        System.out.println(str.length());

       System.out.println( str.substring(2, 6));

       System.out.println(str.concat("alss"));

       System.out.println(str.indexOf("learning"));

       System.out.println(str.contains("learning"));

       System.out.println(str.lastIndexOf('s'));
       
       System.out.println(str.lastIndexOf("am"));
       
      
    }
}


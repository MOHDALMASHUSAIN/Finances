package CH5Recursion;

public class Class1_CWQ1helloworld {
    static void helo(int n){
        if(n==0){
            return;
        }
        System.out.println("hello");
        helo(n-1);
    }
   
    public static void main(String[] args) {
     helo(5);
       
}}

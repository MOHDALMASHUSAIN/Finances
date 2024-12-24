package CH5Recursion;

public class Class2_HWQ5aPowerof2 {
    static boolean power(int n){
        if(n==1){
           return true;
        }
       if(n%2==1){
        return false;
       }
       return power(n/2);
        
    }
    public static void main(String[] args) {
        if(power(17)==true){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not power of 2");
        }
      
    }
}

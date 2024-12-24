package CH5Recursion;

public class Class2_HWQ5bPowerof3 {
    static boolean Powerof3(int n){
      if(n==1){
       
          return true ;
      }   
       if(n%3!=0){
        return false;
       } 
      return  Powerof3(n/3);
         
    }
   public static void main(String[] args) {
   if( Powerof3(27)==true){
    System.out.println("is a power of 3");
   }
   else {
    System.out.println("not a power of 3");
   }
   } 
}

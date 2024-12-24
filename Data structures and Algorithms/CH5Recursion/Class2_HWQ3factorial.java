package CH5Recursion;

public class Class2_HWQ3factorial {
    static void factor(int n, int prod){
        if(n==1){
            System.out.println(prod);
            return;
        }
       prod=prod*n;
        
       factor(n-1, prod);
      

    }
  public static void main(String[] args) {
    
       factor(5, 1);

       



  }

}

package CH5Recursion;

public class Class2_HWQ1reverseaNumber {
    static void  reversefunc(int original ,int reverse){
      if(original==0){
        System.out.println("reverse number is ::"+ reverse);
        return;
      }
      int rem =original%10;
      reverse=reverse*10+rem;
     
      reversefunc(original/10, reverse);
    }
    
     
  public static void main(String[] args) {
    reversefunc(564, 0);
  }  


}
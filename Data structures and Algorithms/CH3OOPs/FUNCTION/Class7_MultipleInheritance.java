package CH3OOPs.FUNCTION;

//
 interface Ai{
     // abstract : declare in superclass but must defined in subclass
    void add();
    void sub();
}
 // 
 interface Bi{
    void mul();
    void rem();
}
class Ci  implements Ai,Bi{
 
   public void add(){
    System.out.println("This is an example of Multiple Inheritance:: add");
   }
   public void sub(){
    System.out.println("This is an example of Multiple Inheritance::sub");
   }
    public void mul(){
    System.out.println("This is an example of Multiple Inheritance::mul");
   }
    public void rem(){
    System.out.println("This is an example of Multiple Inheritance::rem");
   }
}


public class Class7_MultipleInheritance {
    public static void main(String[] args) {
        Ci c = new Ci();
        c.add();
        c.mul();
        c.rem();
        c.sub();




    }
}

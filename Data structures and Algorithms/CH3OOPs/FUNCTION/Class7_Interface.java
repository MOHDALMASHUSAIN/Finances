package CH3OOPs.FUNCTION;
interface Shape {
     int a = 10;
     // void detail();
    // abstract : declare in superclass but must defined in subclass
    void sides();
    void perimeter();
    void area();
}
class Rectangle implements Shape {
    Rectangle (){
        System.out.println("this is a rectangle");
    }
   
    public void sides(){
        System.out.println("two side of a rectangle are a and b");
    }
    public void perimeter (){
        System.out.println("perimeter :: 2(a+b)");
    }
    public void area(){
        System.out.println("area :: a*b");
    }
    public void detail(){
     sides();
     area();
     perimeter();
     System.out.println("value of count :: " + (a+10));
    }
}
public class Class7_Interface {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.detail();
     
    }
}

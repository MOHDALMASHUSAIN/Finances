package CH3OOPs.FUNCTION;
 class A{
A(){
    System.out.println("constructor :A");
}
 public int pic (int a , int b){
return a+b;
}

}
class B extends A{
B(){
    System.out.println("constructor : B");
}}
class C {
    C(){
        System.out.println("Constructor : C");
    }
    void add(){
        System.out.println("C: almas CC");
    }
}


public class Class6_AccessModifier {
public static void main(String[] args) {
    B pi = new B();
    System.out.println(pi.pic(10, 'a'));
   //C co = new C();
    // System.out.println(pic(10, 'a'));  //QQQ ----> data is public but I'm not able to acess
}}



// public , private , protected
// public -- accessible by all (class, method , packages, folders)
// private -- accessible within the same class

// public and protected am allow data visibility from parent class to child class
// but private doesn't
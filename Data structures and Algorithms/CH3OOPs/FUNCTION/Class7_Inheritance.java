package CH3OOPs.FUNCTION;
/*         SINGLE INHERITANCE 
class Inheriatnce1{
    void aW(){
        System.out.println("Single Inheritance :: A");
    }
    int SingleiInheritance(int a , int b){
        return a+b;
    }
}
class BW extends Inheriatnce1{
    @Override
    void aW(){
        super.aW();
System.out.println("Single Inheriatnce :: B");
    }
}
public class Class7_Inheritance {
    public static void main(String[] args) {
        BW ba = new BW();
     System.out.println(ba.SingleiInheritance(12, 'a'));   
     ba.aW();

    }
}

              //MULTILEVEL INHERITANCE

              class Inheriatnce1{
    void aW(){
        System.out.println("MULTILEVEL Inheritance :: AW");
    }
    int SingleiInheritance(int a , int b){
        return a+b;
    }
}
class BW extends Inheriatnce1{
    @Override
    void aW(){
        super.aW();
System.out.println("MULTILEVEL Inheriatnce :: BW");
    }
}
class CW extends BW{
    @Override
    void aW(){
       // super.aW();
System.out.println("MULTILEVEL Inheriatnce :: CW");
    }
}
public class Class7_Inheritance {
    public static void main(String[] args) {
        BW ba = new BW();
     System.out.println(ba.SingleiInheritance(12, 'a'));   
     ba.aW();
     CW ca = new CW();
      ca.aW();
    }
}
*/

                           // HIERARICAL  INHERITANCE
  
                           
    class Inheriatnce1{
    void aW(){
        System.out.println(" HIERARICAL Inheritance :: AW");
    }
    int SingleiInheritance(int a , int b){
        return a+b;
    }
}
class BW extends Inheriatnce1{
    @Override
    void aW(){
        super.aW();
System.out.println("HIERARICAL Inheriatnce :: BW");
    }
}
class CW extends Inheriatnce1{
    @Override
    void aW(){
        super.aW();
System.out.println("HIERARICAL Inheriatnce :: CW");
    }
}
public class Class7_Inheritance {
    public static void main(String[] args) {
        CW ba = new CW();
     System.out.println(ba.SingleiInheritance(12, 'a'));   
     ba.aW();
    }}
